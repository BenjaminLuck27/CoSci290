/* 

Benjamin Luck 
CoSci 290 


*/
import java.util.Scanner;

public class GameDriver{
 
  public static void main(String[] args){
    
    // Stanley splash screen 
    
     System.out.println("    ___________                                 ._.   \n " 
                  +  "   \\_   _____/ ______ ____ _____  ______   ____| |   \n "
                  +  "    |    __)_ /  ___// ___\\\\__  \\ \\____ \\_/ __ \\ |   \n "
                  +  "    |        \\\\___ \\\\  \\___ / __ \\|  |_> >  ___/\\|   \n "
                  +  "   /_______  /____  >\\___  >____  /   __/ \\___  >_   \n "
                  +  "           \\/     \\/     \\/     \\/|__|        \\/\\/ ");
    
    
    System.out.println("Spring Break is just about to begin, you've been planning on \n "
                    + "Doing nothing but staying home and playing video games all day and night. \n "
                    + "The bell rings, everyone begins to rush out the classroom door."
                    + "As you leave the front gate to the school you notice a figure across the street \n" 
                    + "As you walk back home you realise the figure has been following you \n"
                    + "You run towards your home getting to your front door realizing its locked \n"
                    + "You turn to see the figure right infront of you \n" 
                    + "You wake uo in a white room unfamiliar to you."); 
    
      Scanner input = new Scanner(System.in);
    
    System.out.println("What is your name?");
    
    String name = "";
    
    name = input.next();
      
    System.out.println("Welcome " + name + " Escape the Room");
    
    System.out.println("What is your favorite color?");
    
    String color = "";
    
    color = input.next();
    
    System.out.println( color + " is your favorite color");
    
    System.out.println(name + " Do you know where you are?");
      
    String location = "";
    
    location = input.next(); 
    
    System.out.println("Do you remember anything");
    
    String remember = ""; 
    
    remember = input.next();
    
    System.out.println("You have to escape a number of rooms");
    
    
    int numberOfRooms = 6; 
    int actualNumOfRooms = 10;
      
    if(numberOfRooms == actualNumOfRooms){ //evaluates true
      System.out.println("You might Escape and live.");
    }
    else{ 
      System.out.println("You might WILL not survive.");
    }
  }  
 
}