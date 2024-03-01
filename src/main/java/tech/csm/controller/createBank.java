package tech.csm.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tech.csm.entity.Bank;
import tech.csm.entity.BankVo;
import tech.csm.service.BankService;
import tech.csm.service.BankServiceImpl;
import tech.csm.util.DBUtil;


public class createBank extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BankService bankService = new BankServiceImpl();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//creating bank account details
		String bankName= request.getParameter("bankName"); //getting parameter that is being sent
		String regNo= request.getParameter("regNo");
		 String bankId= request.getParameter("bankId");
		 
		 BankVo bvo= new BankVo();
		 bvo.setBankId(bankId);
		 bvo.setBankName(bankName);
		 bvo.setIFSC(regNo);
		 
		 bankService.saveBank(bvo);
		 
		 System.out.println(bvo);
		 
//		 List<Bank> bankList= bankService.getAllBanks();
//		 request.setAttribute("bankList", bankList);
		 
		 RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		 rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
