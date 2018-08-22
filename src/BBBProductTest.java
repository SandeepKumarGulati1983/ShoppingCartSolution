import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.strategy.Product;
import com.strategy.ShopingCart;
import com.strategy.Category.Bath;
import com.strategy.Category.Category;
import com.strategy.Category.Furniture;

class BBBProductTest {

	@Test
	void test() {
		Product product1 = new Product.Builder().setCategory((Category) new Bath()).setName("Bathing tub")
				.setDiscription("Use for bathing purpose").setPrice(100).build();
		
		Product product2 = new Product.Builder().setCategory((Category) new Furniture()).setName("Sofa Set")
				.setDiscription("A 6 Seater sofa set").setPrice(1200).build();

		ShopingCart shopingCart = new ShopingCart();

		shopingCart.addProduct(product1);
		shopingCart.addProduct(product2);

		StringBuffer statement = shopingCart.checkout();
		
		String testStatement = "\n" + 
				"Product name : Bathing tub\n" + 
				"Product Discription : Use for bathing purpose\n" + 
				"Product market Price is : 100.0 Rs\n" + 
				"You incured  a discount of : 10 %\n" + 
				"Reward points collected over this is  : 1 point\n" + 
				".........................\n" + 
				"Product name : Sofa Set\n" + 
				"Product Discription : A 6 Seater sofa set\n" + 
				"Product market Price is : 1200.0 Rs\n" + 
				"You incured  a discount of : 20 %\n" + 
				"Reward points collected over this is  : 2 point\n" + 
				".........................\n" + 
				"CONGRATULATION !! Total discount over your order is  : 250 Rs\n" + 
				" Total reward points earned are   : 3\n" + 
				" Total cart amount without tax    : 1040.0\n" + 
				" Total tax is   : 104.0\n" + 
				" Total cart amount with tax  : 1144.0 Rs\n" + 
				"=============================";
		
		assertEquals(testStatement,statement.toString(),"");
	}

}
