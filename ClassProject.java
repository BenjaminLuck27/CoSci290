/* 
Benjamin Luck 
CoSci 290 
Basic Information Class Proect 
*/ 

import java.util.Scanner;
public class ClassProject{ 
  
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("What is your name?");
    
    String name = "";
    
    name = input.next();
      
    System.out.println("Welcome " + name + " Escape the Room");
    
    System.out.println("What is your favorite color?");
    
    String color = "";
    
    color = input.next();
    
    System.out.println( color + " is your favorite color");
    
    System.out.println(name + " Do you know where you are?");
      
    String location = "";
    
    location = input.next(); 
    
    System.out.println("Do you remember anything");
    
    String remember = ""; 
    
    remember = input.next();
    
  }
}