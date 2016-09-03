package com.overseer.lib;

import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public interface PasswordHashGeneratorFactory {
	public PasswordHashGenerator GetPasswordHashCalculator(String passwordHashGeneratorName) throws PasswordHashGeneratorNotFoundException;
}
