package com.online.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.online.Service.OnlineShopingService;
import com.online.Service.OnlineShopingServiceImpl;
import com.online.bean.Products;

public class ViewProducts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OnlineShopingService signser = new OnlineShopingServiceImpl();
		List<Products> productslist = null;

		try {
			productslist = signser.getAllproducts();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("productslist", productslist);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./viewproduct.jsp");
		dispatcher.forward(request, response);

	}
	}


