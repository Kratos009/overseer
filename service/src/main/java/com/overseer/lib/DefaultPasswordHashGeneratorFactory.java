package com.overseer.lib;

import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public class DefaultPasswordHashGeneratorFactory implements PasswordHashGeneratorFactory {

	public PasswordHashGenerator getPasswordHashCalculator(String passwordHashGeneratorName)
			throws PasswordHashGeneratorNotFoundException {
		switch (passwordHashGeneratorName) {
		case "PBKDF2":
			return new PBKDF2PasswordHashGenerator();
		default:
			throw new PasswordHashGeneratorNotFoundException();
		}
	}

}
