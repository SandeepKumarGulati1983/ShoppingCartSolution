package com.strategy;

import com.strategy.Category.Category;

public class Product {

	String name;
	String discription;
	int discount;
	double price;
	Category category;

	Product(Builder b) {
		this.name = b.name;
		this.discription = b.discription;
		this.discount = b.discount;
		this.price = b.price;
		this.category = b.category;
	}

	public double getPrice() {
		return price;
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

	public static class Builder {

		String name;
		String discription;
		int discount;
		double price;
		Category category;

		public Builder setPrice(double p) {
			this.price = p;
			return this;
		}

		public Builder setName(String n) {
			this.name = n;
			return this;
		}

		public Builder setDiscription(String d) {
			this.discription = d;
			return this;
		}

		public Builder setCategory(Category c) {
			this.category = c;
			return this;
		}

		public Product build() {

			return new Product(this);
		}

	}

}
