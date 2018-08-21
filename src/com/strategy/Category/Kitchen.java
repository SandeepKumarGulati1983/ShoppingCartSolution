package com.strategy.Category;

public class Kitchen implements Category{

	@Override
	public int getDiscount() {
		// Logic of finding the discount .
		return 30;
	}

	@Override
	public int getReward() {
		// logic of finding the reward 
		return 3;
	}

}
