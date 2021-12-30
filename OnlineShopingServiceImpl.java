package com.onlineshopping.service;

import java.sql.SQLException;
import java.util.List;

import com.onlineshoppin.bean.OnlineShoping;
import com.onlineshopping.persistance.OnlineDao;
import com.onlineshopping.persistance.OnlineDaoImpl;

public class OnlineShopingServiceImpl implements OnlineShopingService {
	private OnlineDao onlineDao=new OnlineDaoImpl();
	@Override
	public List<OnlineShoping> getAllUsers() throws ClassNotFoundException, SQLException {
		
		return onlineDao.getAllRecords();
	}

}
