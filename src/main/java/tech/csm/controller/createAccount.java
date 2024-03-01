package tech.csm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tech.csm.entity.AccountVo;
import tech.csm.entity.Bank;
import tech.csm.entity.BankVo;
import tech.csm.service.AccountService;
import tech.csm.service.AccountServiceImpl;
import tech.csm.service.BankService;
import tech.csm.service.BankServiceImpl;

public class createAccount extends HttpServlet {

	private static final long serialVersionUID = 1L;

	AccountService accountService = new AccountServiceImpl();
	BankService bankService = new BankServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		AccountVo aco= new AccountVo();
		String accountName = req.getParameter("name");
		String accountNo = req.getParameter("accountNo");
		String phoneNo = req.getParameter("phoneNo");
		String emailId = req.getParameter("emailId");
		String accountType = req.getParameter("accountType");
		String bank = req.getParameter("bank");
		String balance = req.getParameter("balance");
		
		aco.setAccountNo(accountNo);
		aco.setName(accountName);
		aco.setPhoneNo(phoneNo);
		aco.setEmailId(emailId);
		aco.setAccountType(accountType);
		
		Bank bvo=new Bank();
		bvo.setBankId(bvo.getBankId());
		bvo.setBankName(bvo.getBankName());
		bvo.setIFSC(bvo.getIFSC());
		
		aco.setBank(bvo);
		aco.setBalance(balance);
		
		String accountCreation= accountService.createAccount(aco);
		
		System.out.println(aco);
		System.out.println(accountCreation);
		
		List<Bank> bankList= bankService.getAllBanks();
		System.out.println(bankList);
		 req.setAttribute("bankList", bankList);
		 
		 RequestDispatcher rd= req.getRequestDispatcher("index.jsp");
		 rd.forward(req, resp);
		 
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
