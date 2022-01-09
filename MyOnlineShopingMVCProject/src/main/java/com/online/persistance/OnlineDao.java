package com.online.persistance;

import java.sql.SQLException;



import java.util.List;

import com.online.bean.BuyProduct;
import com.online.bean.OnlineShop;
import com.online.bean.Products;

public interface OnlineDao {
	int saveRecord(OnlineShop signup)throws ClassNotFoundException,SQLException;
	OnlineShop signin(OnlineShop signup)throws ClassNotFoundException,SQLException;
	List<OnlineShop> getAllRecords()throws ClassNotFoundException,SQLException;
	List<Products> getallproducts()throws ClassNotFoundException,SQLException;
	int buyproduct(BuyProduct buyproduct) throws ClassNotFoundException, SQLException;
	BuyProduct getRecordByphone(String phone,String proname)throws ClassNotFoundException,SQLException;
}
