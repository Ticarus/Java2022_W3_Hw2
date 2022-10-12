package com.mycompany.java2022_w3_hw2;
//A class can implement more than 1 interface but can only extend one class (THIS IS IMPORTANT!)
public class MySqlCustomerDal implements ICustomerDal, IRepository{  //Dal for Data Access Layer 
    @Override
    public void add(){
        System.out.println("Added to My Sql");
    }
}
