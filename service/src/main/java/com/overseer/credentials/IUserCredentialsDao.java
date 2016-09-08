package com.overseer.credentials;

public interface IUserCredentialsDao {

	public UserCredentials getUserCredentialsByUsername(String username);

	public void insertUserCredentials(UserCredentials userCredentials);

	public void updateUserCredentials(UserCredentials userCredentials);

	public void deleteUserCredentialsByUsername(String username);
}
