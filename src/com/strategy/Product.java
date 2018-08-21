package com.strategy;

import com.strategy.Category.Category;


public class Product {

	String name;
	String discription;
	int discount;
	double price;
	Category category;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDiscription(String disc) {
		this.discription = disc;
	}

	public void setCategory(Category c) {
		this.category = c;
	}

	public String getName() {
		return name;
	}

	public int getDiscount() {

		return category.getDiscount();
	}

	public String getDiscription() {
		return discription;
	}

	public Category getCategory() {
		return category;
	}
}
