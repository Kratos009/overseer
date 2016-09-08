package com.overseer.util;
import java.util.Properties;

public class PropertiesCache {

	private Properties configProp = null;

	private PropertiesCache() {
		IConfigurationPropertyDao configurationPropertyDao =  new ConfigurationPropertyDao();
		configProp = configurationPropertyDao.getConfigurationProperties();
	}

	private static class LazyHolder {
		private static final PropertiesCache INSTANCE = new PropertiesCache();
	}

	public static PropertiesCache getInstance() {
		return LazyHolder.INSTANCE;
	}

	public String getProperty(String key) {
		return configProp.getProperty(key);
	}

	public String getProperty(String key, String defaultValue) {
		return configProp.getProperty(key, defaultValue);
	}
}
