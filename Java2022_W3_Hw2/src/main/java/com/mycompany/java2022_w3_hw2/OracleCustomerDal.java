package com.mycompany.java2022_w3_hw2;

public class OracleCustomerDal implements ICustomerDal{  //Every class which implements an Interface must use its methods
    @Override
    public void add(){
        System.out.println("Added to Oracle");
    }
}
