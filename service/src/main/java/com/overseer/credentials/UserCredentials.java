package com.overseer.credentials;

import java.security.SecureRandom;

import com.overseer.lib.PasswordHashGenerator;
import com.overseer.lib.PasswordHashGeneratorFactory;
import com.overseer.lib.PropertiesCache;
import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public class UserCredentials implements CredentialService {
	private String uuid;
	private String username;
	private byte[] passwordHash;
	private byte[] passwordSalt;
	private String passwordKeyDerivationFunction;
	private String passwordHashAlgorithm;
	private int passwordHashIterationCount;
	private int passwordHashDerivedKeyLength;
	private int passwordSaltLength;
	private PasswordHashGeneratorFactory passwordHashGeneratorFactory;

	public UserCredentials(PasswordHashGeneratorFactory passwordHashGeneratorFactory) {
		this.passwordHashGeneratorFactory = passwordHashGeneratorFactory;
	}

	@Override
	public String SaveNewCredentails(String username, String password) {
		try {
			PasswordHashGenerator passwordHashGenerator = this.passwordHashGeneratorFactory.getPasswordHashCalculator(
					PropertiesCache.getInstance().getProperty("passwordHashCalculator", "PBKDF2"));
			SecureRandom sr = new SecureRandom();
			this.username = username;
			this.passwordSaltLength = Integer
					.parseInt(PropertiesCache.getInstance().getProperty("passwordSaltLength", "64"));
			this.passwordSalt = new byte[this.passwordSaltLength];
			sr.nextBytes(this.passwordSalt);
			this.passwordHashAlgorithm = PropertiesCache.getInstance().getProperty("passwordHashAlgorithm", "SHA256");
			this.passwordHashIterationCount = Integer
					.parseInt(PropertiesCache.getInstance().getProperty("passwordHashIterationCount", "20000"));
			this.passwordHashDerivedKeyLength = Integer
					.parseInt(PropertiesCache.getInstance().getProperty("passwordHashDerivedKeyLength", "256"));
			this.passwordHash = passwordHashGenerator.GeneratePasswordHash(password, this.passwordSalt,
					this.passwordHashAlgorithm, this.passwordHashIterationCount, this.passwordHashDerivedKeyLength);
		} catch (PasswordHashGeneratorNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean AuthenticateCredentials(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ChangePassword(String username, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub

	}

}
