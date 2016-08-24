package com.ppr.prudhvicartdao;

import java.util.List;

import com.ppr.prudhvicart.Model.Supplier;



public interface SupplierDAO {
	
	
	public List<Supplier> list();

	public Supplier get(String id);
	
	public void delete(String id);

	public void saveOrUpdate(Supplier supplier);

	
	
	
	
	

	


	


}
