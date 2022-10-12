package com.mycompany.java2022_w3_hw2;

public class CustomerManagerPolymorphism {
    private BaseLogger logger;
    
    public CustomerManagerPolymorphism(BaseLogger logger){
        this.logger = logger;
    }
    
    public void add(){
        System.out.println("Customer added");
        this.logger.log("Log message");
    }
}
