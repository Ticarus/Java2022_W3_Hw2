package com.mycompany.java2022_w3_hw2;

public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isValid(product)){
            System.out.println("Product added");
        }
        else{
            System.out.println("Product information is invalid");
        }
    }
}
