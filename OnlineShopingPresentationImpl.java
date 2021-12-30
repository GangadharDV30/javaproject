package com.onlineshopping.presentation;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.onlineshoppin.bean.OnlineShoping;
import com.onlineshopping.service.OnlineShopingService;
import com.onlineshopping.service.OnlineShopingServiceImpl;

public class OnlineShopingPresentationImpl implements OnlineShopingPresentationDao {
	private OnlineShopingService onlineService=new OnlineShopingServiceImpl();
	@Override
	public void showMenu() {
		System.out.println("1.Show all Users");
		System.out.println("7.Exit");
		
	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			try {
				List<OnlineShoping> onlineShoping=onlineService.getAllUsers();
				for(OnlineShoping online:onlineShoping) {
					System.out.println(online);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			break;
		
	}

}
}
