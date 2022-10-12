package com.mycompany.java2022_w3_hw2;

public class FileLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to file : " + message);
    }
}
