package com.mycompany.java2022_w3_hw2;
 
public class DatabaseHelper {
    public static class Crud{  //Crud means Create read update delete
        public static void delete(){
            System.out.println("Deleted");
        }
        public static void update(){
            System.out.println("Updated");
        }
    }
    
    public static class Connection{
       public static void createConnection(){
           System.out.println("Connection created");
       }
    }
}
