package com.mycompany.java2022_w3_hw2;
//My workers
public class Worker implements IWorkable, IEatable, IPayable{
    @Override
    public void work(){
        System.out.println("Worker completed scheduled work");
    }

    @Override
    public void eat() {
        System.out.println("Food credits sent to worker");
    }
    
    @Override
    public void pay(){
        System.out.println("Worker's salary paid");
    }
}
