package com.overseer.credentials;

public class UserCredentials {
	private String uuid;
	private String username;
	private byte[] passwordHash;
	private byte[] passwordSalt;
	private String passwordKeyDerivationFunction;
	private String passwordHashAlgorithm;
	private int passwordHashIterationCount;
	private int passwordHashDerivedKeyLength;
}
