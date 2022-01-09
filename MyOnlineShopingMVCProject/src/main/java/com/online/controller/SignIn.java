package com.online.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.Service.OnlineShopingService;
import com.online.Service.OnlineShopingServiceImpl;
import com.online.bean.OnlineShop;

public class SignIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String phonenumber=request.getParameter("uname");
		String password=request.getParameter("pwd");
		OnlineShop signup=new OnlineShop(phonenumber,password);
		
		 OnlineShopingService  signupser=new OnlineShopingServiceImpl();
		
		ServletContext application=request.getServletContext();
		application.setAttribute("phonenumber", phonenumber);
		try {
			if(signupser.getsignin(signup)) {
				response.sendRedirect("./main.jsp");
			}
			else {
				response.sendRedirect("./Signinfailed.jsp");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
