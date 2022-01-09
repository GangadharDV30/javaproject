package com.online.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.Service.OnlineShopingService;
import com.online.Service.OnlineShopingServiceImpl;
import com.online.bean.BuyProduct;

public class OnlineShopingBuyProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String proname=request.getParameter("proname");
		String phone=request.getParameter("phone");
		int protaken=Integer.parseInt(request.getParameter("protaken"));
		OnlineShopingService onlineService=new OnlineShopingServiceImpl();
		BuyProduct buyproduct=new BuyProduct(proname, phone, protaken);
		

	String message=null;
		try {
			if(onlineService.insertbuyproduct(buyproduct)) {
			message="Thanks For Shopping You Can Generate Your Bill";
		}
		else {
			message="Buy Product Failed!";
		}
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
		}
		
		
		request.setAttribute("message", message);
		RequestDispatcher dispatcher=request.getRequestDispatcher("./output.jsp");
		dispatcher.forward(request, response);
	}

}
