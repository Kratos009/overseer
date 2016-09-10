package com.overseer.credentials;

import com.overseer.credentials.exceptions.IncorrectPasswordException;
import com.overseer.credentials.exceptions.NewPasswordSameAsCurrentPasswordException;
import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public interface ICredentialService {

	public String saveNewCredentials(String username, String password) throws PasswordHashGeneratorNotFoundException;

	public String authenticateCredentials(String username, String password)
			throws PasswordHashGeneratorNotFoundException, IncorrectPasswordException;

	public void changePassword(String username, String currentPassword, String newPassword)
			throws PasswordHashGeneratorNotFoundException, IncorrectPasswordException,
			NewPasswordSameAsCurrentPasswordException;

	public void resetPassword(String username, String newPassword) throws PasswordHashGeneratorNotFoundException;

}
