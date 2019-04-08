package com.acme.ecommerce.exceptions;

public class ProductNotFoundException extends RuntimeException {

    //Exception exposed to user
    public ProductNotFoundException(){
        super("Product not found!");
    }
}
