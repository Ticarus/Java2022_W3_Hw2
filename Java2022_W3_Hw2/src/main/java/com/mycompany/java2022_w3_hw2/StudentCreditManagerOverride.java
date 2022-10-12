package com.mycompany.java2022_w3_hw2;

public class StudentCreditManagerOverride extends BaseCreditManagerOverriding{
    public double calculate(double amount){
        return amount * 1.10;
    }
}
