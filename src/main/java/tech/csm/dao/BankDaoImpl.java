package tech.csm.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import tech.csm.entity.Bank;

import tech.csm.util.DBUtil;

public class BankDaoImpl implements BankDao {

	@Override
	public String saveBank(Bank b) {
		Session session=DBUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(b);
		transaction.commit();
		return "Bank details saved successfully!";
	}

	@Override
	public List<Bank> getAllBanks() {
	List<Bank> bankList= new ArrayList();
	Session session=DBUtil.getSessionFactory().openSession();
	Transaction tx=session.beginTransaction();
	Query<Bank> query= session.createQuery("from Bank",Bank.class);
	bankList=query.list();
	tx.commit();
		return bankList;
	}

}
