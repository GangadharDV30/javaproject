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
import com.online.bean.OnlineShop;


class RegisterNewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			 OnlineShopingService sign=new OnlineShopingServiceImpl();
			OnlineShop signup=new OnlineShop(email,name, phone, password);
			

		String message=null;
			try {
				if(sign.insertUser(signup)) {
				message="Thanks for Registering !!! Registeration sucessfull";
			}
			else {
				message="Registration Failed!! re-Register";
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			}
			request.setAttribute("message", message);
			RequestDispatcher dispatcher=request.getRequestDispatcher("./successfulreg.jsp");
			dispatcher.forward(request, response);
	}

}
