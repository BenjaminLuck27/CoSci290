public class TestScenario{
 
  public static void main(String[] args){
  
    
    int minimum = 1; 
    int maximum = 5; 
    int randomNum = minimum + (int)(Math.random() + maximum); 
    
    
       System.out.println("You can see 5 doors choose the correct one to live");
    
    if(randomNum >= 5)
      System.out.println("You have gone through the correct door"); 
    
    else if(randomNum <= 4){
      System.out.println("You have choosen Death!");
    }
    else if(randomNum <= 3){
      System.out.println("You have found a brick wall behind this door");
    }
    else if(randomNum <= 2){
      System.out.println("You cannot opne this door it is locked");
    }
    else if(randomNum <= 1){
      System.out.println("You touch a painting of a door");
    }
  }
}