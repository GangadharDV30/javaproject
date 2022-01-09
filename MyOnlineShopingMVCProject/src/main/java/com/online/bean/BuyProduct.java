package com.online.bean;

public class BuyProduct {
	private String phone;
	
	private String proname;
	
	private int protaken;
	private int procost;
	public int getProcost() {
		return procost;
	}
	public void setProcost(int procost) {
		this.procost = procost;
	}
	public int getProtaken() {
		return protaken;
	}
	public void setProtaken(int protaken) {
		this.protaken = protaken;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public BuyProduct(String proname,String phone,int protaken) {
		super();
		this.phone = phone;
		this.proname = proname;
		this.protaken = protaken;
	}
	public BuyProduct(String proname,String phone,int protaken,int procost) {
		this.phone = phone;
		this.proname = proname;
		this.protaken = protaken;
		this.procost=procost;
	}
	@Override
	public String toString() {
		return "User phone=" + phone +"\n"+"Product name="+ proname +"\n"+ "Product taken =" + protaken + "\n"+"Product cost per product="
				+ procost;
	}
	
}
