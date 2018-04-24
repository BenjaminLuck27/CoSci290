/*
Benjamin Luck
CoSci 290
*/

public class Lab15{

   public static void main(String [] args){
      int n = 0;
      while (Math.pow(n,3) < 12000)
      {
         if (Math.pow(n + 1,3) >= 12000)
            break;
         n++;
         System.out.println("The largest integer that n can be is " + n + "\n" + Math.pow(n, 3));
      }
      
	  }
   }


  
   