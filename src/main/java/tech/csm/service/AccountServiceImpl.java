package tech.csm.service;

import tech.csm.dao.AccountDao;
import tech.csm.dao.AccountDaoImpl;
import tech.csm.entity.Account;
import tech.csm.entity.AccountVo;

public class AccountServiceImpl implements AccountService {

	AccountDao accountDao= new AccountDaoImpl();
	
	@Override
	public String createAccount(AccountVo aco) {
		//convert aco to ac
		if (aco!=null) {
			Account a= new Account();
			a.setAccountNo(aco.getAccountNo());
			a.setName(aco.getName());
			a.setPhoneNo(aco.getPhoneNo());
			a.setEmailId(aco.getEmailId());
			a.setAccountType(aco.getAccountType());
			a.setBalance(Double.valueOf(aco.getBalance()));
			a.setBank(aco.getBank());
			accountDao.createAccount(a);
		}
		return "successful in adding account!";
	}

}
