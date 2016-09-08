package com.overseer.lib;

import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public interface IPasswordHashGeneratorFactory {
	public IPasswordHashGenerator getPasswordHashCalculator(String passwordHashGeneratorName) throws PasswordHashGeneratorNotFoundException;
}
