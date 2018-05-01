/*
Benjamin Luck 
CoSci 290

lab- 
write a program that takes user input in thr format of "(number betweem 0-9 ) [item]
input 2 guns 

output 
you have 2 items
those two items are guns 
*/
import java.util.Scanner;

public class Group2Lab{
  
   public static void main(String [] args){
     
     Scanner input = new Scanner(System.in);
     
     String str = "";
     
     System.out.println("Enter a number and item");
     
     System.out.println("You have" + str + "item");
     System.out.println(str.substring(0 , 4));
   
   
   }
}  