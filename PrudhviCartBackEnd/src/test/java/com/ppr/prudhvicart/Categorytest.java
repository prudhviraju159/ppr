package com.ppr.prudhvicart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ppr.prudhvicart.Model.Category;
import com.ppr.prudhvicartdao.CategoryDAO;

public class Categorytest {
	
	

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("com.ppr.prudhvicart");
		context.refresh();
		
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		   
		   
	   
	   Category category = 	(Category) context.getBean("category");
	   category.setId("P123");
	   category.setName("CG120");
	   category.setDescription("CGDesc120");
	   
	   
	   categoryDAO.saveOrUpdate(category);	   
	   

		 

		
	}  

	}




