package com.overseer.lib;

public interface PasswordHashGenerator {
	public byte[] GeneratePasswordHash(final String password, final byte[] passwordSalt, final String hashAlgorithm,
			final int iterations, final int derivedKeyLength);
}
