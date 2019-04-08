package com.acme.ecommerce.exceptions;

public class OutOfStockException extends RuntimeException {

    //Exception exposed to user
    public OutOfStockException(){
        super("Product out of stock!");
    }
}