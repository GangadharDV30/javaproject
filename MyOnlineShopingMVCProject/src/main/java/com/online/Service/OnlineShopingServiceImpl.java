package com.online.Service;

import java.sql.SQLException;





import java.util.List;

import com.online.bean.BuyProduct;
import com.online.bean.OnlineShop;
import com.online.bean.ProductPaySlip;
import com.online.bean.Products;
import com.online.persistance.OnlineDao;
import com.online.persistance.OnlineDaoImpl;

public class OnlineShopingServiceImpl implements OnlineShopingService{
	private OnlineDao onlineService=new OnlineDaoImpl();

	@Override
	public boolean insertUser(OnlineShop signup) throws ClassNotFoundException, SQLException {
	
		int rows=onlineService.saveRecord(signup);
		if(rows>0) {
			return true;
		}
		return false;
	}
	@Override
	public List<OnlineShop> getAllsignup() throws ClassNotFoundException, SQLException {
		
		return onlineService.getAllRecords();
	}
	@Override
	public List<Products> getAllproducts() throws ClassNotFoundException, SQLException {
		
		return onlineService.getallproducts();
	}
	@Override
	public boolean insertbuyproduct(BuyProduct buyproduct) throws ClassNotFoundException, SQLException {
		
		int rows=onlineService.buyproduct(buyproduct);
		if(rows>0) {
			return true;
		}
		return false;
	}
	@Override
	public ProductPaySlip generatePayslip(String phone, String proname) throws ClassNotFoundException, SQLException {
	
		BuyProduct buyproduct=onlineService.getRecordByphone(phone, proname);
		ProductPaySlip productpayslip=null;
		if(buyproduct!=null) {
			double gst=buyproduct.getProcost()*0.18;
			double totalcost=(gst*buyproduct.getProtaken())+(buyproduct.getProcost()*buyproduct.getProtaken());
			productpayslip=new ProductPaySlip(buyproduct,totalcost);
			
		}
		return productpayslip;
	}
	@Override
	public boolean getsignin(OnlineShop signup) throws ClassNotFoundException, SQLException {
		
		OnlineShop signup1=onlineService.signin(signup);
		if(signup1!=null) {
			return true;
		}
		return false;
		}
	}
	

