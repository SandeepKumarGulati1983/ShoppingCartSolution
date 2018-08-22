package com.strategy;

import java.util.ArrayList;

public class ShopingCart {
	/*
	 * there will be multiple Product Each product will be having Info / Name /
	 * price
	 * 
	 * one Order may keep multiple Product -- like Home order / bathing order /
	 * furniture order etc Attributes: List of products / Order type / total order
	 * value
	 * 
	 * Shopping Cart will provide detail info of orders / history of Order and
	 * products
	 * 
	 * Attributes : History of Orders / total cart value
	 * 
	 * 
	 * Main Output
	 * 
	 * Complete Cart / having details of each Order / details of Products / total
	 * cart value / tax and discount calculation
	 * 
	 * History of order -- last historical order .
	 * 
	 */

	ArrayList<Product> productList;


	int discount = 0;
	int rewardPoint = 0;
	double totalPrice = 0;
	double totalTax = 0;

	public ShopingCart() {
		init();
	}

	private void init() {
		productList = new ArrayList();
	}

	public void addProduct(Product p) {
		productList.add(p);
	}

	StringBuffer statement = new StringBuffer();

	public StringBuffer checkout() {

		if (productList.isEmpty()) {
			statement.append("There is no item in the cart");
		} else {
			for (Product p : productList) {
				calculateDiscount(p);
				calculateTotalPrice(p);
				calculateReward(p);
				appendEachProductStatement(p);

			}
			totalTax = (totalPrice * 10) / 100; // random tax calculation  -- can be drived by taxation rules 
			appendCartSummary();
		}

		return statement;

	}

	void appendEachProductStatement(Product p) {
		statement.append("\n");
		statement.append("Product name : " + p.getName());
		statement.append("\n");
		statement.append("Product Discription : " + p.getDiscription());
		statement.append("\n");
		statement.append("Product market Price is : " + p.getPrice() + " Rs");
		statement.append("\n");
		statement.append("You incured  a discount of : " + p.getDiscount() + " %");
		statement.append("\n");
		statement.append("Reward points collected over this is  : " + p.getCategory().getReward() + " point");
		statement.append("\n" + ".........................");
	}

	void appendCartSummary() {
		statement.append("\n");
		statement.append("CONGRATULATION !! Total discount over your order is  : " + discount + " Rs");
		statement.append("\n");
		statement.append(" Total reward points earned are   : " + rewardPoint);
		statement.append("\n");
		statement.append(" Total cart amount without tax    : " + totalPrice);
		statement.append("\n");
		statement.append(" Total tax is   : " + totalTax); // rough for test only -- need taxation rules here
		statement.append("\n");
		statement.append(" Total cart amount with tax  : " + (totalTax + totalPrice) + " Rs");
		statement.append("\n" + "=============================");
	}

	void calculateDiscount(Product p) {
		discount += (p.getPrice() * p.getDiscount()) / 100;
	}

	void calculateTotalPrice(Product p) {
		totalPrice += p.getPrice() - discount;
	}

	void calculateReward(Product p) {

		rewardPoint += p.getCategory().getReward();

	}

}
