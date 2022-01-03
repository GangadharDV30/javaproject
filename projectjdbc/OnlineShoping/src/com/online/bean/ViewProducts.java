package com.online.bean;

public class ViewProducts {
	private int productId;
	 private String productName;
	 private double productCost;
	private int productCount;
	
	public ViewProducts() {
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public int getProductCount() {
		return productCount;
	}

	public void setProductCount(int productCount) {
		this.productCount = productCount;
	}

	public ViewProducts(int productId, String productName, double productCost, int productCount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
		this.productCount = productCount;
	}

	@Override
	public String toString() {
		return "ViewProducts [productId=" + productId + ", productName=" + productName + ", productCost=" + productCost
				+ ", productCount=" + productCount + "]";
	}
	
	
	
}
