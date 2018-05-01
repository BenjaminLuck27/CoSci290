/* 
Benjamin Luck 
CoSci 290 
MidTerm Lab
*/ 

  import java.util.Scanner;

  public class LabMidterm{
  
   public static void main(String[] args){
  
   Scanner input = new Scanner(System.in);
   // User input on how many numbers should be printed  
   System.out.println("Enter n:");
   int n = input.nextInt();
   // Displaying the matrix
   printMatrix(n);
     
   System.out.println(" Enter another n");
   int m = input.nextInt();
   printmatrix(n);
   }
    // Beginning of matrix 
    public static void printMatrix(int n){
    
    for(int i = 0; i < n; i++){
    int random = 0 + (int)(Math.random() * 11);
    System.out.print(random);
    }
      //String str1 = "";
      //str1.charAt(n);
      //str1.length();
      }
     public static void printmatrix(int n){
    
    for(int i = 0; i < n; i++){
    int random = 0 + (int)(Math.random() * 11);
    System.out.print(random);
    
    }
    
    
  }
  }
     