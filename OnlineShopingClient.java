package com.onlineshopping.client;

import java.util.Scanner;

import com.onlineshopping.presentation.OnlineShopingPresentationDao;
import com.onlineshopping.presentation.OnlineShopingPresentationImpl;

public class OnlineShopingClient {
public static void main(String[] args) {
	
	OnlineShopingPresentationDao onlineShopingPresentation=new OnlineShopingPresentationImpl();
	Scanner scanner = new Scanner(System.in);
		while(true) {
			onlineShopingPresentation.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			onlineShopingPresentation.performMenu(choice);
			
		}
	}

}
