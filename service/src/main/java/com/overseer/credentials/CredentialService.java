package com.overseer.credentials;

public interface CredentialService {

	public String SaveNewCredentails(String username, String password);

	public boolean AuthenticateCredentials(String username, String password);

	public void ChangePassword(String username, String oldPassword, String newPassword);
}
