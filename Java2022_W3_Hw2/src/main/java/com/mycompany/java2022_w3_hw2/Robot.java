package com.mycompany.java2022_w3_hw2;

public class Robot implements IWorkable, IMaintainable{
    @Override
    public void work(){
        System.out.println("Robot completed scheduled work");
    }
    
    @Override
    public void maintenance(){
        System.out.println("Degradation in six axis arm detected, maintenance request sent");
    }
}
