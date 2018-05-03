/*
Benjamin Luck (Worked with Thomas Mak)
CoSci290 
Array Lab
*/
// allows user to enter data 
import java.util.Scanner;

  public class Lab18{
  
    public static void main(String[] args){
    
      Scanner input = new Scanner(System.in);
      
      double[] num = new double[10];
      //prompts user to enter data 
      System.out.println("Enter ten different numbers");
      
     for(int i = 0; i < num.length; i++){
       num[i] = input.nextDouble();
     }
      // displays the results 
      System.out.println(min(num) + " is your minimum number");
      
     }//end main
    
    //new method 
    public static double min(double[] array){
      
      // declares variable and array 
      double min = array[0];
      
     //checks min with every other number 
      for(double num : array){
        if(num < min)
          min = num;
      }
      return min;
      
    }// ends array 
  }// end class 