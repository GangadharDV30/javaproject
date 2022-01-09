package com.online.persistance;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.online.bean.BuyProduct;
import com.online.bean.OnlineShop;
import com.online.bean.Products;
import com.online.helper.Databaseconnector;


public class OnlineDaoImpl implements OnlineDao {

	@Override
	public int saveRecord(OnlineShop signup) throws ClassNotFoundException, SQLException {
		Connection connection = Databaseconnector.getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("INSERT INTO LOGIN(EMAIL,NAME,PHONE,PASSWORD) VALUES(?,?,?,?)");
		preparedStatement.setString(1, signup.getEmail());
		preparedStatement.setString(2, signup.getName());
		preparedStatement.setString(3, signup.getPhone());
		preparedStatement.setString(4, signup.getPassword());
		int rows=preparedStatement.executeUpdate();
		
		return rows;
	}

	@Override
	public List<OnlineShop> getAllRecords() throws ClassNotFoundException, SQLException {
List<OnlineShop> signuplist = new ArrayList<OnlineShop>();

		
		Connection connection = Databaseconnector.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM LOGIN");
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			String email = resultSet.getString("EMAIL");
			String name = resultSet.getString("NAME");
			String phone = resultSet.getString("PHONE");
			String pass = resultSet.getString("PASSWORD");
		
			
			OnlineShop signup=new OnlineShop(email, name,phone,pass);
			signuplist.add(signup);
		}

		connection.close();

		return signuplist;
	}

	@Override
	public List<Products> getallproducts() throws ClassNotFoundException, SQLException {
List<Products> productslist = new ArrayList<Products>();

		
		Connection connection = Databaseconnector.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PRODUCTS");
		ResultSet resultSet = preparedStatement.executeQuery();
		
		while (resultSet.next()) {
			String proid = resultSet.getString("PROID");
			String proname = resultSet.getString("PRONAME");
			int procost = resultSet.getInt("PROCOST");
			int proavail = resultSet.getInt("PROAVAIL");
		
			
			Products products=new Products(proid, proname,procost,proavail);
			productslist.add(products);
		}

		connection.close();

		return productslist;
	}

	@Override
	public int buyproduct(BuyProduct buyproduct) throws ClassNotFoundException, SQLException {
	
		String proid="";
		int procost=0,proavail=0;
		
		Connection connection = Databaseconnector.getConnection();
		PreparedStatement preparedStatement = connection
				.prepareStatement("SELECT PROID,PROCOST,PROAVAIL FROM PRODUCTS WHERE PRONAME=?");
		
		
		preparedStatement.setString(1,buyproduct.getProname());
		
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			
			proid=resultSet.getString("PROID");
			procost=resultSet.getInt("PROCOST");
			proavail=resultSet.getInt("PROAVAIL");
			
			
		}
		System.out.println(proid);
		PreparedStatement preparedStatement1 = connection
				.prepareStatement("INSERT INTO BUY_PRODUCT(PHONE,PROID,PRONAME,PROCOST,PROTAKEN) VALUES(?,?,?,?,?)");
		preparedStatement1.setString(1,buyproduct.getPhone());
		preparedStatement1.setString(2, proid);
		preparedStatement1.setString(3,buyproduct.getProname());
		preparedStatement1.setInt(4, procost);
		preparedStatement1.setInt(5,buyproduct.getProtaken());
		int rows=preparedStatement1.executeUpdate();
		proavail=proavail-buyproduct.getProtaken();
		PreparedStatement preparedStatement2 = connection
				.prepareStatement("UPDATE PRODUCTS SET PROAVAIL=? WHERE PRONAME=?");
		preparedStatement2.setInt(1,proavail);
		preparedStatement2.setString(2,buyproduct.getProname());
		int uprow=preparedStatement2.executeUpdate();
		return rows;
	}

	@Override
	public BuyProduct getRecordByphone(String phone, String proname) throws ClassNotFoundException, SQLException {
		
BuyProduct buyproductforslip=null;
		
		Connection connection = Databaseconnector.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM BUY_PRODUCT WHERE PHONE=? AND PRONAME=?");
		preparedStatement.setString(1,phone);
		preparedStatement.setString(2, proname);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		
		if (resultSet.next()) {
			
			String	proid = resultSet.getString("PROID");
			int procost = resultSet.getInt("PROCOST");
			int protaken = resultSet.getInt("PROTAKEN");
			buyproductforslip=new BuyProduct(proname,phone,protaken,procost);
		
		}

		connection.close();
		return buyproductforslip;
	}

	@Override
	public OnlineShop signin(OnlineShop signup) throws ClassNotFoundException, SQLException {
		OnlineShop signup1=null;
		Connection connection = Databaseconnector.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM LOGIN WHERE PHONE=? AND PASSWORD=?");
		preparedStatement.setString(1,signup.getPhone());
		preparedStatement.setString(2,signup.getPassword());
		ResultSet resultSet = preparedStatement.executeQuery();
		
		if (resultSet.next()) {
			String phone = resultSet.getString("PHONE");
			String pwd = resultSet.getString("PASSWORD");
			
			signup1 = new OnlineShop(phone, pwd);

		}
		connection.close();
		return signup1;
	}

	
	

	

}
