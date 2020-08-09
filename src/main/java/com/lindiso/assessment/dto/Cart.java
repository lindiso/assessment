package com.lindiso.assessment.dto;

import java.util.List;

public class Cart {
    private List<Product> products;
    private static Cart cart_instance = null;


    private Cart(){
    }

    public static Cart getInstance(){
        if (cart_instance == null){
            cart_instance = new Cart();
        }
        return cart_instance;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
