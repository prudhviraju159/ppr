package com.ppr.prudhvicartdao;

import java.util.List;

import com.ppr.prudhvicart.Model.Category;

public interface CategoryDAO {
	
	
	public List<Category> list();

	public Category get(String id);
	
	public void delete(String id);

	public void saveOrUpdate(Category category);
	
	
	
	

	


	


}
