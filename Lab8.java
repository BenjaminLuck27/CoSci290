/* 
Benjamin Luck 
CoSci 290 

*/

import java.util.Scanner;
  public class Lab8{
  
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
        System.out.print("Enter multiple integers to find the sum of them: ");
          long value = in.nextLong();
      
      
             System.out.println("The sum of all digits is: " + sumDigits(value));
    }

                public static int sumDigits(long n){
                  
        int temp = (int)Math.abs(n);
        int sum = 0;
        
        while(temp != 0){
            sum += (temp % 10);
            temp = temp / 10;
        }

        return sum;
    }    
}