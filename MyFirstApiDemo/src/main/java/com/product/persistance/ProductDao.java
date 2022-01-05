package com.product.persistance;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import com.product.bean.Product;

public interface ProductDao {
	public List<Product> listAllProducts()throws ClassNotFoundException,SQLException;
	public Product getProductByCode(String productCode)throws ClassNotFoundException,SQLException;
}
