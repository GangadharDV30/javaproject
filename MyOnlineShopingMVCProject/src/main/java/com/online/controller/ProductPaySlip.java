package com.online.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.Service.OnlineShopingService;
import com.online.Service.OnlineShopingServiceImpl;



public class ProductPaySlip extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userphone = request.getParameter("phone");
		String productname = request.getParameter("proname");
		OnlineShopingService sign = new OnlineShopingServiceImpl();
		com.online.bean.ProductPaySlip productpayslip=null;
		try {
			productpayslip=sign.generatePayslip(userphone, productname);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		if(productpayslip!=null) {
			request.setAttribute("productpayslip", productpayslip);
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("./payslip.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
