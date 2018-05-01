/*
Benjamin Luck 
CoSci 290 
Lab 6 (Repeat Additions)
*/

import java.util.Scanner;
public class Lab7{
  
  
  public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
      System.out.println("Enter an number, the input ends if you type a 0: ");
    String str = input.next();
    int number = 0;
      
    if(number == 0){
      System.out.println("No numbers that are entered should be 0");
    }
      for(int i = 0; i < str.length(); i++){
        System.out.println(str.charAt(i));
        if(!Character.isDigit(str.charAt(i))){
          System.out.println("This is not a digit! " + str.charAt(i));
            break;
    
    }
   } 
  }
 }
