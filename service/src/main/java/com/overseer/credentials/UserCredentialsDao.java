package com.overseer.credentials;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.overseer.util.HibernateUtil;
public class UserCredentialsDao implements IUserCredentialsDao {
	
	public UserCredentialsDao() {
	}

	@Override
	public UserCredentials getUserCredentialsByUsername(String username) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		UserCredentials userCredentials = null;
		try {
			tx = session.beginTransaction();
			userCredentials = (UserCredentials) session.get(UserCredentials.class, username);
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			throw ex;
		} finally {
			session.close();
		}
		return userCredentials;
	}

	@Override
	public void insertUserCredentials(UserCredentials userCredentials) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(userCredentials);
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			throw ex;
		} finally {
			session.close();
		}

	}

	@Override
	public void updateUserCredentials(UserCredentials userCredentials) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(userCredentials);
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			throw ex;
		} finally {
			session.close();
		}

	}

	@Override
	public void deleteUserCredentialsByUsername(String username) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			UserCredentials userCredentials = (UserCredentials) session.get(UserCredentials.class, username);
			session.delete(userCredentials);
			tx.commit();
		} catch (HibernateException ex) {
			if (tx != null)
				tx.rollback();
			throw ex;
		} finally {
			session.close();
		}
	}

}
