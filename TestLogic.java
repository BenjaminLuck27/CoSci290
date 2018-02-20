/* 

Benjamin Luck 
CoSci 290 

Topics: 
multi

*/
import java.util.Scanner; 
public class TestLogic{

  public static void main(String[] args){
  
    
   Scanner input = new Scanner(System.in);
    
    System.out.println("Enter in a grade");
    
    int grade = 90; 
    
    //simple 
    if(grade >= 90){
      System.out.println("A"); 
   }
  
    if(grade < 90){
      System.out.println("grade is not an A");
    }
    
    else{
      System.out.println("grade is an A");
     
    }
     
    if(grade >= 90){
      System.out.println("A"); 
    }
     else if(grade >= 80){
       System.out.println("B"); 
      
     }
    else if(grade >= 70){
      System.out.println("C");
    }
    else{
      System.out.println("F"); 
    
    }
    /* logical operators 
      ! - NOT 
      != - NOT equal to
      == - IS equal to  
      && - AND 
      || - OR
    
   */ 
    
    // Symbolic Logic w/ Java Logical Oporators 
    // && => if both is true, the condition evaluates to true 
    // p = True 
    // q = true 
    // || => or => if either is true the condtion evaluates to true 
    // at least one is true 
    
    //usinbg if else write code the checks wether a students
    // grade is good, average, or bad 
    
    if(grade >= 80){
      System.out.println("This is a good grade"); 
    }
    else if(grade < 80 && grade >= 70){
      System.out.println("This grade is average"); 
     
    }
    else{
      System.out.println("This is a bad grade ");
    }
    }
    
  }
