package com.overseer.util;

import java.util.List;
import java.util.Properties;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ConfigurationPropertyDao implements IConfigurationPropertyDao {

	public ConfigurationPropertyDao() {
	}

	@Override
	public Properties getConfigurationProperties() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		Properties configProperties = new Properties();
		try {
			tx = session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<ConfigurationProperty> properties = session.createCriteria(ConfigurationProperty.class).list();
			properties.forEach(property -> configProperties.put(property.getPropertyName(), property.getPropertyValue()));
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			throw ex;
		} finally {
			session.close();
		}
		return configProperties;
	}

}
