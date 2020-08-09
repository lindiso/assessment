package com.lindiso.assessment.dto;

import com.lindiso.assessment.util.ConverterUtil;


public class Product {
    private String name;
    private double unitPrice;
    private double total;
    private int quantity;

    public Product(String name){
     this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return ConverterUtil.roundDouble(total, 2);
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
