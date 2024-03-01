package tech.csm.dao;


import java.util.List;

import tech.csm.entity.Bank;


public interface BankDao {

	String saveBank(Bank b);

	List<Bank> getAllBanks();

 
 
 
}
