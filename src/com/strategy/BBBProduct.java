package com.strategy;

import com.strategy.Category.Bath;
import com.strategy.Category.Category;
import com.strategy.Category.Furniture;

public class BBBProduct {

	public static void main(String[] args) {

		// Product product1 = new Product();
		// product1.setName("Bathing tub");
		// product1.setDiscription("Use for bathing purpose");
		// product1.setPrice(100);
		// product1.setCategory((Category)new Bath()); // category will provide discount
		// and reward points
		//
		//
		// Product product2 = new Product();
		// product2.setName("Sofa Set");
		// product2.setDiscription("A 6 Seater sofa set ");
		// product2.setPrice(1200);
		// product2.setCategory((Category)new Furniture());

		Product product1 = new Product.Builder().setCategory((Category) new Bath()).setName("Bathing tub")
				.setDiscription("Use for bathing purpose").setPrice(100).build();
		
		Product product2 = new Product.Builder().setCategory((Category) new Furniture()).setName("Sofa Set")
				.setDiscription("A 6 Seater sofa set").setPrice(1200).build();

		ShopingCart shopingCart = new ShopingCart();

		shopingCart.addProduct(product1);
		shopingCart.addProduct(product2);

		StringBuffer statement = shopingCart.checkout();

		System.out.println(statement);
	}

}
