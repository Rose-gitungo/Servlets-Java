package tech.csm.service;

import java.util.List;

import tech.csm.dao.BankDao;
import tech.csm.dao.BankDaoImpl;
import tech.csm.entity.Bank;
import tech.csm.entity.BankVo;

public class BankServiceImpl implements BankService {

	BankDao bankDao= new BankDaoImpl();
	
	@Override
	public String saveBank(BankVo bvo) {
		Bank b=new Bank();
		if (bvo!=null) {
			b.setBankId(Integer.parseInt(bvo.getBankId()));
			b.setBankName(bvo.getBankName());
			b.setIFSC(bvo.getIFSC());	
			bankDao.saveBank(b);
		}		
		
		return "Bank converted to default types successfully!";
	}

	@Override
	public List<Bank> getAllBanks() {
		return bankDao.getAllBanks();
	}

}
