package com.ppr.prudhvicart.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="supplier")
@Component

public class Supplier {
	
	
	
	private String id;
	
	private String name;
	
	private String address;
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}


    @Id
	public String getId() {
		return id;
	}



	public void setId(String id) {
		// TODO Auto-generated method stub
		
	}

}
