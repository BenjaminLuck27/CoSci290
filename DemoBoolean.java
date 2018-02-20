/* 

Benjamin Luck 
CoSci 290 

Demo Topic on 
  - Increment/decrement operators 
  - augmented assignment operatiopns 
  // casting with ints, doubles, and chars 
*/

public class DemoBoolean{

  //start of application
  public static void main(String [] args){
    
    //line 17 and 18 are equvilant 
    int num = 1; 
    num = num + 1; //increment num by 1 
    ++num; 
    
    num = 1;
    int count = ++num; // pre-increment, count 2, num 2 
    System.out.println("count " + count + " num " + num);
    num = 1; 
    count = num ++; // post - increment. count 1, num 2 
    System.out.println("count " + count + " num " + num); 
    
    count = num--; //post- decrement 
    count = --num; //pre-decreament 
    
    //examples of augemented assignment operators 
    num += 2; // equvilant to => num - num + 2;
    //num *= 2; // num = num * 2;
    //num /= 2; // num = num / 2;
    num -= 2; // num = num - 2;
   
    num = 2; 
    double num2 = 3.0 * count; 
    System.out.println("Double wins:" + num * num2);
    System.out.println("Casting a double to int: " + (int) num2); //lose the decimal part
    System.out.println("Casting and int into a double" + (double) num); //turn the 2 into 2.0 
    System.out.println("Casting a char to a int" + (int) 'c'); // turns the c into 99 b/c of ASCII
    
    int numberOfZombies = 3; 
    int actualNumofZombies = 100; 
    
    if(numberOfZombies == actualNumofZombies){ //evaluates true
      System.out.println("You might survive this apocalypse.");
    }
    else{ 
      System.out.println("You might NOT survive this apocalypse.");
    }
    
    //Generating = random number 
    //Math.pow (3, 2); 2*2 
    
    System.out.println(Math.random()); // random number bwtween 0 and 1 
    
    //minimun  = Math.random () + maximum  
    //formula for any range use ==> Min + (Math.random() * (MAx -Min))
    System.out.println(1 + (int)(Math.random() + (10 - 5))); 
    
    if(chanceOfSurving <= 3){
      System.out.println("You made it Alive!");
    }
        else{
          System.out.println("Game Over!");
        }
   
  }

}