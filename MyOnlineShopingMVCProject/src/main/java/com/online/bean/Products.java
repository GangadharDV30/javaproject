package com.online.bean;

public class Products {
	private String proid;
	private String pname;
	private int procost;
	private int proavail;
	public String getProid() {
		return proid;
	}
	public void setProid(String proid) {
		this.proid = proid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getProcost() {
		return procost;
	}
	public void setProcost(int procost) {
		this.procost = procost;
	}
	public int getProavail() {
		return proavail;
	}
	public void setProavail(int proavail) {
		this.proavail = proavail;
	}
	public Products(String proid, String pname, int procost, int proavail) {
		super();
		this.proid = proid;
		this.pname = pname;
		this.procost = procost;
		this.proavail = proavail;
	}
	@Override
	public String toString() {
		return "Products [proid=" + proid + ", pname=" + pname + ", procost=" + procost + ", proavail=" + proavail
				+ "]";
	}

}
