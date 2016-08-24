package com.ppr.prudhvicart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ppr.prudhvicart.Model.Supplier;
import com.ppr.prudhvicartdao.SupplierDAO;

public class Suppliertest {
	
	

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.ppr.prudhvicart");
		context.refresh();
		
		SupplierDAO supplierDAO= (SupplierDAO) context.getBean("supplierDAO");
		   
		   
	   
	   Supplier supplier = 	(Supplier) context.getBean("supplier");
	   supplier.setId("P123");
	   supplier.setName("CG120");
	   supplier.setAddress("hyderabad");
	   
	   
	   supplierDAO.saveOrUpdate(supplier);	   
	   

		 

		
	}  

	}




