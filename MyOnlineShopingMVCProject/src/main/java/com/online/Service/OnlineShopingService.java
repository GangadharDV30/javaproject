package com.online.Service;

import java.sql.SQLException;




import java.util.List;

import com.online.bean.BuyProduct;
import com.online.bean.OnlineShop;
import com.online.bean.ProductPaySlip;
import com.online.bean.Products;


public interface OnlineShopingService {
	public boolean getsignin(OnlineShop signup)throws ClassNotFoundException,SQLException;
	List<OnlineShop> getAllsignup()throws ClassNotFoundException,SQLException;
	public boolean insertUser(OnlineShop signup) throws ClassNotFoundException, SQLException;
	List<Products> getAllproducts()throws ClassNotFoundException,SQLException;
	public boolean insertbuyproduct(BuyProduct buyproduct) throws ClassNotFoundException, SQLException;
	public ProductPaySlip generatePayslip(String phone,String proname)throws ClassNotFoundException, SQLException;
}
