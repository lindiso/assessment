package com.lindiso.assessment.service.impl;


import com.lindiso.assessment.dto.Cart;
import com.lindiso.assessment.dto.Product;
import com.lindiso.assessment.service.TemplateService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class TemplateServiceImpl implements TemplateService {
    private  double UNIT_PRICE = 39.99;


    @Override
    public float templateMethod(float kelvin) {
        return 0;
    }

    @Override
    public void addProductToCart(Product product, int quantity) {
        List<Product> products = new ArrayList<>();
        Cart cart = new Cart();
        if (product != null && product.getName().equalsIgnoreCase("Dove Soap")){
            BigDecimal total  = BigDecimal.valueOf(UNIT_PRICE * quantity);
            product.setQuantity(quantity);
            product.setUnitPrice(UNIT_PRICE);
            product.setTotal(total);
            products.add(product);
            cart.setProducts(products);
        }

    }
}
