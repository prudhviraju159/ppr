package com.ppr.prudhvicartdao;

import java.util.List;

import com.ppr.prudhvicart.Model.Product;

public interface ProductDAO {
	
	

	public List<Product> list();

	public Product get(String id);	

	public void delete(String id);

	

	public void saveOrUpdate(Product product);

	



}
