package com.overseer.credentials;

import java.security.SecureRandom;
import java.util.UUID;

import com.overseer.lib.IPasswordHashGenerator;
import com.overseer.lib.IPasswordHashGeneratorFactory;
import com.overseer.lib.PropertiesCache;
import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public class CredentialService implements ICredentialService {

	private IPasswordHashGeneratorFactory passwordHashGeneratorFactory;
	private IUserCredentialsDao userCredentialsDao;

	public CredentialService(IPasswordHashGeneratorFactory passwordHashGeneratorFactory,
			IUserCredentialsDao userCredentialsDao) {
		this.passwordHashGeneratorFactory = passwordHashGeneratorFactory;
		this.userCredentialsDao = userCredentialsDao;
	}

	@Override
	public String saveNewCredentials(String username, String password) throws PasswordHashGeneratorNotFoundException {

		String passwordKeyDerivationFunction = PropertiesCache.getInstance().getProperty("passwordHashCalculator");
		IPasswordHashGenerator passwordHashGenerator = passwordHashGeneratorFactory
				.getPasswordHashCalculator(passwordKeyDerivationFunction);
		SecureRandom sr = new SecureRandom();
		int passwordSaltLength = Integer.parseInt(PropertiesCache.getInstance().getProperty("passwordSaltLengthInBytes"));
		byte[] passwordSalt = new byte[passwordSaltLength];
		sr.nextBytes(passwordSalt);
		String passwordHashAlgorithm = PropertiesCache.getInstance().getProperty("passwordHashAlgorithm");
		int passwordHashIterationCount = Integer
				.parseInt(PropertiesCache.getInstance().getProperty("passwordHashIterationCount"));
		int passwordHashDerivedKeyLength = Integer
				.parseInt(PropertiesCache.getInstance().getProperty("passwordHashDerivedKeyLengthInBits"));
		byte[] passwordHash = passwordHashGenerator.GeneratePasswordHash(password, passwordSalt, passwordHashAlgorithm,
				passwordHashIterationCount, passwordHashDerivedKeyLength);
		UserCredentials userCredentials = new UserCredentials();
		userCredentials.setUuid(UUID.randomUUID().toString());
		userCredentials.setUsername(username);
		userCredentials.setPasswordHash(passwordHash);
		userCredentials.setPasswordKeyDerivationFunction(passwordKeyDerivationFunction);
		userCredentials.setPasswordHashAlgorithm(passwordHashAlgorithm);
		userCredentials.setPasswordSalt(passwordSalt);
		userCredentials.setPasswordHashIterationCount(passwordHashIterationCount);
		userCredentials.setPasswordHashDerivedKeyLength(passwordHashDerivedKeyLength);
		userCredentials.setPasswordSaltLength(passwordSaltLength);
		userCredentialsDao.insertUserCredentials(userCredentials);
		return userCredentials.getUuid();
	}

	@Override
	public boolean authenticateCredentials(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void changePassword(String username, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub

	}

}
