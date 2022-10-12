package com.mycompany.java2022_w3_hw2;

public abstract class GameCalculator {  
    public abstract void calculate();  //Because it is an abstract method everything that inherits GameCalculator class must override this method
    
    public final void gameOver(){  //Non overridable because of final
        System.out.println("Game over!");
    }
}
