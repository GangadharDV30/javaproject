package com.onlineshopping.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlineshopping.helper.OracleConnection;
import com.onlineshoppin.bean.OnlineShoping;

public class OnlineDaoImpl implements OnlineDao{

	@Override
	public List<OnlineShoping> getAllRecords() throws ClassNotFoundException, SQLException {
		List<OnlineShoping> onlineshoping=new ArrayList<OnlineShoping>();
		Connection connection = OracleConnection.getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM LOGIN");
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			String userName = resultSet.getString("USERNAME");
			String pass = resultSet.getString("PASSWORD");
			long phoneNum = resultSet.getLong("PHONE");
			
			OnlineShoping Shoping=new OnlineShoping(userName,pass,phoneNum);
			onlineshoping.add(Shoping);
		}

		connection.close();

		return onlineshoping;
	}
}

//	@Override
//	public OnlineShoping getRecordById(int id) throws ClassNotFoundException, SQLException {
//		
//			OnlineShoping onlineshoping=null;
//			
//			Connection connection = OracleConnection.getConnection();
//			
//			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM PRODUCTS WHERE ID=?");
//			preparedStatement.setInt(1, id);
//			
//			ResultSet resultSet = preparedStatement.executeQuery();
//			
//			if (resultSet.next()) {
//				int pid = resultSet.getInt("PRODUCT_ID");
//				String pname = resultSet.getString("PRODUCT_NAME");
//				int pcost= resultSet.getInt("PRODUCT_COST");
//				int noofpro = resultSet.getInt("PRODUCT_COUNT_AVAILABLE");
//			
//				
//				onlineshoping=new OnlineShoping(pid, pname, pcost,  noofpro);
//			
//			}
//
//			connection.close();
//			return onlineshoping;
//		}
//	}


