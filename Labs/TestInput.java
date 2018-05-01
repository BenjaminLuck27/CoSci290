/* 
Benjamin Luck 
CoSci 290 

Testing datatypes and input form the user 
*/ 
import java.util.Scanner;
public class TestInput{
    // main.method startting point of application 
  public static void main(String[] args){
    //datatype variableName + expression 
    //1. identifiers can only start with a letter, _. or $ 
    //2. Identtifiers with mutltiple words are camelCased
    //e.g. - numofStudents, name, interestRate
    
    //datatypes
    // int- interger - whole number => 3, 2147493647. 102, -11
    // double = decimal number => 3.33. 0.2, 0.33333. -33.33 
    // char - single character inside single quotations => '3', 'f', ' ' 
    // boolean - true or false => true, false 
    
    // object/reference datatypes 
    // String - Character surround with double quotations => "sjfjksdf" . "cat" , "3" 
    /* There are other objects in Java thay come with Java and that are custom 
      =>Objects/class that comes with Java: Scanner, System, Math, etc. Objects 
      =>customer classes: Zombie, SpaceInvader, Person, etc. 
    */
    
    
    
   int numberofStudents = 29;
   double avgGPA = 3.76; 
   String name = "";
   Boolean gameOver = false; //or True 
   int age = 0;
   
   Scanner input = new Scanner(System.in);
    
   name = input.next(); //.next () if for StringType 
    
   System.out.println("Hi " + name); 
   
   System.out.println("How old are you?");
    
   age = input.nextInt(); //.nextInt() is for Int types
    
   System.out.println("You are " + age + " years old");
    
    /*
      arythmetic Oporators 
    - addition 
    - subtraction
    - multiplication
    - division 
    - modules, reminder. e.g. 10 % 2 ==> 10 / 2 and then finding reminder, which is 0 
    - assignment operators, equals 
    
    Math operations follow the name order of operations 
    () exponents, multiplication OR division, addition OR subtraction 
    from left ot right 
    
    
    */ 
    
    int month = age * 12;
    int days = age * 365; 
    int hours = age * 24; 
   
   System.out.println("You are " + month + " months old OR " + days + " days old OR " + hours + " hours old!"); 
    
    
  }
}