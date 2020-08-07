package com.lindiso.assessment.service;

import com.lindiso.assessment.dto.Product;

import java.math.BigDecimal;

public interface TemplateService {
   float templateMethod(float kelvin);

   void addProductToCart(Product product, int quantity);


}
