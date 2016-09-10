package com.overseer.credentials;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.UUID;

import com.overseer.credentials.exceptions.IncorrectPasswordException;
import com.overseer.credentials.exceptions.NewPasswordSameAsCurrentPasswordException;
import com.overseer.lib.IPasswordHashGenerator;
import com.overseer.lib.IPasswordHashGeneratorFactory;
import com.overseer.util.PropertiesCache;
import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public class CredentialService implements ICredentialService {

	private IPasswordHashGeneratorFactory passwordHashGeneratorFactory;
	private IUserCredentialsDao userCredentialsDao;
	private String passwordKeyDerivationFunction;
	private String passwordHashAlgorithm;
	private int passwordSaltLength;
	private int passwordHashIterationCount;
	private int passwordHashDerivedKeyLength;

	public CredentialService(IPasswordHashGeneratorFactory passwordHashGeneratorFactory,
			IUserCredentialsDao userCredentialsDao) {
		this.passwordHashGeneratorFactory = passwordHashGeneratorFactory;
		this.userCredentialsDao = userCredentialsDao;
		this.passwordKeyDerivationFunction = PropertiesCache.getInstance().getProperty("passwordHashCalculator");
		this.passwordHashAlgorithm = PropertiesCache.getInstance().getProperty("passwordHashAlgorithm");
		this.passwordSaltLength = Integer
				.parseInt(PropertiesCache.getInstance().getProperty("passwordSaltLengthInBytes"));
		this.passwordHashIterationCount = Integer
				.parseInt(PropertiesCache.getInstance().getProperty("passwordHashIterationCount"));
		this.passwordHashDerivedKeyLength = Integer
				.parseInt(PropertiesCache.getInstance().getProperty("passwordHashDerivedKeyLengthInBits"));
	}

	@Override
	public String saveNewCredentials(String username, String password) throws PasswordHashGeneratorNotFoundException {
		UserCredentials userCredentials = new UserCredentials();
		userCredentials.setUuid(UUID.randomUUID().toString());
		userCredentials.setUsername(username);
		this.applyPasswordPolicy(userCredentials, password);
		userCredentialsDao.insertUserCredentials(userCredentials);
		return userCredentials.getUuid();
	}

	@Override
	public String authenticateCredentials(String username, String password)
			throws PasswordHashGeneratorNotFoundException, IncorrectPasswordException {
		UserCredentials userCredentials = userCredentialsDao.getUserCredentialsByUsername(username);
		if (!this.verifyPassword(userCredentials, password))
			throw new IncorrectPasswordException();
		return userCredentials.getUuid();
	}

	@Override
	public void changePassword(String username, String currentPassword, String newPassword)
			throws PasswordHashGeneratorNotFoundException, IncorrectPasswordException,
			NewPasswordSameAsCurrentPasswordException {
		if (currentPassword.equals(newPassword))
			throw new NewPasswordSameAsCurrentPasswordException();
		UserCredentials userCredentials = userCredentialsDao.getUserCredentialsByUsername(username);
		if (!this.verifyPassword(userCredentials, currentPassword))
			throw new IncorrectPasswordException();
		this.applyPasswordPolicy(userCredentials, newPassword);
		userCredentialsDao.updateUserCredentials(userCredentials);

	}

	@Override
	public void resetPassword(String username, String newPassword) throws PasswordHashGeneratorNotFoundException {
		UserCredentials userCredentials = userCredentialsDao.getUserCredentialsByUsername(username);
		this.applyPasswordPolicy(userCredentials, newPassword);
		userCredentialsDao.updateUserCredentials(userCredentials);
	}

	private boolean verifyPassword(UserCredentials userCredentials, String password)
			throws PasswordHashGeneratorNotFoundException {
		IPasswordHashGenerator passwordHashGenerator = passwordHashGeneratorFactory
				.getPasswordHashCalculator(userCredentials.getPasswordKeyDerivationFunction());
		byte[] passwordHash = passwordHashGenerator.GeneratePasswordHash(password, userCredentials.getPasswordSalt(),
				userCredentials.getPasswordHashAlgorithm(), userCredentials.getPasswordHashIterationCount(),
				userCredentials.getPasswordHashDerivedKeyLength());
		return Arrays.equals(passwordHash, userCredentials.getPasswordHash());

	}

	private void applyPasswordPolicy(UserCredentials userCredentials, String password)
			throws PasswordHashGeneratorNotFoundException {
		IPasswordHashGenerator passwordHashGenerator = passwordHashGeneratorFactory
				.getPasswordHashCalculator(passwordKeyDerivationFunction);
		SecureRandom sr = new SecureRandom();
		byte[] passwordSalt = new byte[passwordSaltLength];
		sr.nextBytes(passwordSalt);
		byte[] passwordHash = passwordHashGenerator.GeneratePasswordHash(password, passwordSalt, passwordHashAlgorithm,
				passwordHashIterationCount, passwordHashDerivedKeyLength);
		userCredentials.setPasswordHash(passwordHash);
		userCredentials.setPasswordKeyDerivationFunction(passwordKeyDerivationFunction);
		userCredentials.setPasswordHashAlgorithm(passwordHashAlgorithm);
		userCredentials.setPasswordSalt(passwordSalt);
		userCredentials.setPasswordHashIterationCount(passwordHashIterationCount);
		userCredentials.setPasswordHashDerivedKeyLength(passwordHashDerivedKeyLength);
		userCredentials.setPasswordSaltLength(passwordSaltLength);
	}

}
