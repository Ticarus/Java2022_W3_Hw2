package com.mycompany.java2022_w3_hw2;

public class BaseCreditManagerOverriding {
    public double calculate(double amount){
        return amount * 1.18;
    }
}

/*Overridable unless you make it non overridable, the final part makes the method non overridable

public final double calculate(double amount){
        return amount * 1.18;
    }
If this method is used the StudentCreditManagerOverride class won't be able to override thus the code will
give an error 
*/
