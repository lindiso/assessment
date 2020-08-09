package com.lindiso.assessment.tests.unit;

import com.lindiso.assessment.dto.Cart;
import com.lindiso.assessment.dto.Product;
import com.lindiso.assessment.service.TemplateService;
import com.lindiso.assessment.util.ConverterUtil;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class AssessmentApplicationTests {


	//autowire the service
	@Autowired
	private TemplateService templateService;

	@Test
	void methodTemplate() {
		//add code to test
	}

	@Test
	public void add_product_ToCart() {
		Cart cart = Cart.getInstance();
		List<Product> products = new ArrayList<>();
		Product product = new Product("Dove Soap");
		templateService.addProductToCart(product, 5);
		products.add(product);
		cart.setProducts(products);


		Assert.assertEquals(5, cart.getProducts().get(0).getQuantity());
		Assert.assertEquals(39.99, cart.getProducts().get(0).getUnitPrice(), 0);
		Assert.assertEquals(199.95, cart.getProducts().get(0).getTotal(),0);

	}



}
