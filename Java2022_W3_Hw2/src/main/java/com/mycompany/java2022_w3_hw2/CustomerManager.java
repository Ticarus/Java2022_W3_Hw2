package com.mycompany.java2022_w3_hw2;

public class CustomerManager extends PersonManager{
    private ICustomerDal customerDal;
    
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    
    public void add(){
        customerDal.add();
    }
}
