package tech.csm.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tech.csm.entity.Account;
import tech.csm.entity.Bank;
import tech.csm.entity.Transaction;

public class DBUtil {
	private static SessionFactory sessionFactory;
	static {	
		sessionFactory=new Configuration()
			.addAnnotatedClass(Account.class)
			.addAnnotatedClass(Bank.class)
			.addAnnotatedClass(Transaction.class)
			.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	
}
