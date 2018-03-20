/*
Benjamin Luck 
CoSci 290 

*/

import java.util.Scanner;

  public class Lab10{
  
   public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    int number = 0; 
    double celsius;

     System.out.println("Enter temperature in fahrenheit ");
     number = input.nextInt(); 
     double fahrenheit = number;
     celsius = fahrenheitToCelsius(fahrenheit);
         
     System.out.println("The temperature is " + celsius + " degrees celsius");
     
     fahrenheit = celsiusToFahrenheit(celsius); 
     ;break
     
     System.out.println("Enter temperature in celsius");
    
     System.out.println("The temperature is " + fahrenheit + " degrees fahrenheit");
     
     }
    
    public static double fahrenheitToCelsius(double fahrenheit){   
      double celsius;
      celsius = (5.0 / 9) * (fahrenheit - 32);
      return celsius; 
    }
   
    public static double celsiusToFahrenheit(double celsius){
      double fahrenheit;
      fahrenheit = (9.0 / 5) * celsius + 32;
      return fahrenheit;
    
    }
  
  
  }

    
      
 
    
     
  
    