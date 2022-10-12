package com.mycompany.java2022_w3_hw2;

public class ProductValidator {
    
    static{
        System.out.println("Static constructer block is working");
    }
    
    public ProductValidator(){
        System.out.println("Constructer block is working");
    }
    
    public static boolean isValid(Product product){  //Putting a static to this method allows for use in another class for one time it is like making a new but it stays in the memory till the application is restarted
        return product.getPrice() > 0 && !product.getName().isEmpty();  
    }
    
    public void something(){  //To be able to use this method we must make a new ProductValidator in the class we will use this method
        
    }
    //Inner class
    public static class AnotherClass{  //We can use static classes in Java if the class is in another class 
        public static void Classeption(){
            System.out.println("In order to use a static with a class in Java, the class must be an inner class or I would like to call it the Classeption");
        }
    }
}
