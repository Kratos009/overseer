package com.overseer.credentials;

import com.overseer.lib.exceptions.PasswordHashGeneratorNotFoundException;

public interface ICredentialService {

	public String saveNewCredentials(String username, String password) throws PasswordHashGeneratorNotFoundException;

	public boolean authenticateCredentials(String username, String password);

	public void changePassword(String username, String oldPassword, String newPassword);
	
}
