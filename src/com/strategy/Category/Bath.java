package com.strategy.Category;

public class Bath implements Category{

	@Override
	public int getDiscount() {
		// Logic for generating Discount 
		return 10;
	}

	@Override
	public int getReward() {
		// Logic for generating Rewards 
		return 1;
	}

}
