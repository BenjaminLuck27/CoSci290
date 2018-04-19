/*
  Benjamin Luck
  CoSci 290
  HW 1: Demo of Project
*/

/*
HW1 Instruction
1. Create a class called "GameDriver" and save/name the file "GameDriver.java".
2. The program should start up with your text adventure splash screen (it would be a good idea
   to use the one from Lab 1).
3. Next, the program should have a print out of some story telling that starts
   the text adventure
4. Then, set up the game with questions asked from the user to start the text
   adventure (use same questions from Lab 2).
5. When the game is over, end the program with a "GAME OVER" message.

REMEMBER:
  Declare all your variables at the beginning of the program.  
*/

/* 
  git init
  git add .
  git commit -m "<insert some note about what you did>"
  git push origin master
  
  Do this command right before editing code every session:
  git pull origin master
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.Scanner;
public class GameDriver{

  // Start of application
  public static void main(String[] args){ 
    // Create Scanner
    Scanner input = new Scanner(System.in);
   
    Utility tool = new Utility();
    //Utility write = new Ultility();
    // Display splash screen
    tool.readFile("SplashScreen.txt");
      
    tool.readFile("GameDriver.txt");
    
    // Start of Game Time
   
    
    // Declaring variables
    //int question;
    //int name;
    //int idea;
           
    // Question #1
    System.out.println("What is your name?");
     
    String name = "";
    name = input.nextLine();
    //tool.writeFile("PlayerInfo.txt");
    System.out.println("Welcome " + name + ", to Escape the Room");
    
    
    // Let the game begin!
    System.out.println("There are 5 doors in this room, choose the right one to proceed to the next room! If not you'll have a nasty surprise!");
    
    // Generate number between 1 to 5
    //int randomNum = (int)((Math.random() * 5) + 1);
    //System.out.println((int)((Math.random() * 5) + 1));
   
    System.out.println("Now choose 1 of these 5 doors.");
    int choice = input.nextInt(); 
    if(choice == 3){
      System.out.println("You have choosen the right door. Please move ahead.");
    }
    else if(choice == 5){
      System.out.println("You have found a creepy doll");
    }
    else if(choice == 4){
      System.out.println("You found a pit that you fell into. Might wanna check before stepping in next time");
    }
    else if(choice == 3){
      System.out.println("You found a key for another room.");
    }
    else if(choice == 2){
      System.out.println("You found a chest full of... nothing.");
    }
   else if(choice == 1){
      System.out.println("You found a wall behind this door");
   }
    
   tool.readFile("EndSplash.txt");
  }
}