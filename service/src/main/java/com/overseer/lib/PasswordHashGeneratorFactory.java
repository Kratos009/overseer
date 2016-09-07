package com.overseer.lib;

import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public interface PasswordHashGeneratorFactory {
	public PasswordHashGenerator getPasswordHashCalculator(String passwordHashGeneratorName) throws PasswordHashGeneratorNotFoundException;
}
