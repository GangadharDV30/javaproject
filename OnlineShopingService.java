package com.onlineshopping.service;

import java.sql.SQLException;
import java.util.List;

import com.onlineshoppin.bean.OnlineShoping;

public interface OnlineShopingService {
	List<OnlineShoping> getAllUsers()throws ClassNotFoundException,SQLException;
//	public OnlineShoping getEmployeeById(String id) throws ClassNotFoundException, SQLException;
}
