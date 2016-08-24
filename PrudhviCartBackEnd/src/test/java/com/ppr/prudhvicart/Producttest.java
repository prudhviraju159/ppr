package com.ppr.prudhvicart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ppr.prudhvicart.Model.Product;
import com.ppr.prudhvicartdao.ProductDAO;

public class Producttest {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.ppr.prudhvicart");
		context.refresh();
		
		
	   ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
	   
	   Product product = 	(Product) context.getBean("product");
	   product.setId("p001");
	   product.setName("symphony");
	   product.setDescription("it is blue");
	   product.setPrice(10000);
	   
	   
	 productDAO.saveOrUpdate(product);

	}
}
