package com.overseer.lib;

import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public class DefaultPasswordHashGeneratorFactory implements IPasswordHashGeneratorFactory {

	public IPasswordHashGenerator getPasswordHashCalculator(String passwordHashGeneratorName)
			throws PasswordHashGeneratorNotFoundException {
		switch (passwordHashGeneratorName) {
		case "PBKDF2":
			return new PBKDF2PasswordHashGenerator();
		default:
			throw new PasswordHashGeneratorNotFoundException();
		}
	}

}
