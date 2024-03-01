package tech.csm.service;

import java.util.List;

import tech.csm.entity.Bank;
import tech.csm.entity.BankVo;

public interface BankService {

	String saveBank(BankVo bvo);

	List<Bank> getAllBanks();

}
