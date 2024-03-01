package tech.csm.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tech.csm.entity.Account;
import tech.csm.util.DBUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public String createAccount(Account a) {
		Session sess= DBUtil.getSessionFactory().openSession();
		Transaction tx=sess.beginTransaction();
		sess.save(a);
		tx.commit();
		return "Creation of account successful!";
	}

}
