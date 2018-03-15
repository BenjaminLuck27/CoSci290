/*
Benjamin Luck 
CoSci 290 

*/

import java.util.Scanner;

  public class Lab9{
  
   public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
     
     int number = 0;            
     // prompt user to input integer
      System.out.println("Enter an Integer: ");
      number = input.nextInt();
     // checking if the integer inputed is a palindrome
     if (isPalindrome(number)){
         System.out.println(number + " is a palindrome");
     }
     else
          System.out.println(number + " is not a palindrome");
      }
          
     //prints interget out 
        //System.out.println(number);
        //System.out.println(reverse(input.nextInt()));
     
     //Returns true if integer is a Paldindrome 
     public static Boolean isPalindrome(int number){
       
       Boolean palindrome; 
       
       palindrome = number == reverse(number);
       
         return palindrome;
       }
     
     public static int reverse(int number){
       
       int temp = 0, reverse = 0;
       
       while (temp > 10){
         temp = number % 10; 
         reverse = reverse + temp * 10;
         number /= 10; 
       }
       
       reverse += number;
       return reverse;
     }
     
     
  }
