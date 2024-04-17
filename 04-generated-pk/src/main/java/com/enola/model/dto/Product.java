package com.enola.model.dto;

import org.springframework.stereotype.Repository;

@Repository
public class Product {
	
	private int id;
	private String name;
	private Category category;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) { // setter =>properties name
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
