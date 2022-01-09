package com.online.bean;

public class ProductPaySlip {
	private BuyProduct buyproduct;
	
	private double totalcost;
	public BuyProduct getBuyproduct() {
		return buyproduct;
	}
	public void setBuyproduct(BuyProduct buyproduct) {
		this.buyproduct = buyproduct;
	}
	
	public void setTotalcost(int totalcost) {
		this.totalcost = totalcost;
	}
	public double getTotalcost() {
		return totalcost;
	}
	public ProductPaySlip(BuyProduct buyproduct,double totalcost) {
		super();
		this.buyproduct = buyproduct;
		this.totalcost = totalcost;
	}
	@Override
	public String toString() {
		return "Product_payslip:-"+"\n" + buyproduct + "\n"+"Totalcost with GST=" + totalcost;
	}
	

}
