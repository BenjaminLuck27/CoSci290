/*
  Author: Benjamin Luck
  
  Lab 21: Complete implementation for each function 
    to complete this Tic Tac Toe game!
  
*/

import java.util.*;

public class TicTacToe{
  
  //declare 2d array to hold X's and O's to represent board
  static char[][] board = {
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
                          };
  static char xo = 'x'; //holds which player is currently playing
  static boolean gameOver = false; //ends the loop if there is a winner
    
  //start of program
  public static void main(String[] args){
    
    //declare variables
    Scanner input = new Scanner(System.in);
    int row = 0;
    int col = 0;
    
    System.out.println("Let's play Tic Tac Toe!");
       
    //while there isn't a winner
    while(!gameOver){
      printBoard();
      System.out.println("It is " + xo + "'s turn. Please enter 0, 1, 2 for row");
      row = input.nextInt();
      System.out.println("Please enter 0, 1, 2 for col");
      col = input.nextInt();
      move(row, col);
      if(checkWinner()){
        gameOver = true;
      }
    }
    
  }//end of main method
  
  /*
    This method prints the Tic Tac Toe board
    with updated moves by players.
  */
  public static void printBoard(){
      System.out.println("/---|---|---\\");
      System.out.println("| " + board[0][0] + " | " + board[1][0] + " | " + board[2][0] + " |");
      System.out.println("|-----------|");
      System.out.println("| " + board[0][1] + " | " + board[1][1] + " | " + board[2][1] + " |");
      System.out.println("|-----------|");
      System.out.println("| " + board[0][2] + " | " + board[1][2] + " | " + board[2][2] + " |");
      System.out.println("\\---|---|---/");
  }//end of printBoard
  
  public static void changeXO(){
   if (xo == 'o'){
     xo = 'x';
   }
    else{
      xo = 'o';
    }
    
  }//end of changeXO
  
  /*
    If there isn't already an x or o in that row and col
    place the character in the array.
    Then change xo.
    Else prompt the user to try again because there's already an x or o here.
  */
  public static void move(int row, int col){
      if (board[row][col] == ' '){
        board[row][col] = xo;
        changeXO();
      }
    else{
      System.out.println("Try Again block is occupied");
    }
   /* 
    for(int i = 0; i < board.length; i++){ //goes through each row 
        for(int j = 0; j < board[i].length; j++){  //goes though each column
         // board[row][col] = row * col += " xo";       
          //System.out.println(board[row][col]);//print
          //move += board[row][col];
          System.out.print(board[row][col]);
          }
      }
    */
   
  }//end of move
  
  /*
    Returns true if there there is a winner or a draw to end the game
  */
  public static boolean checkWinner(){
     if (board[0][0] == board[0][1] && board[0][0] == board[0][2] && board[0][0] != ' ' ||
        board[1][0] == board[1][1] && board[1][0] == board[1][2] && board[1][0] != ' ' || 
        board[2][0] == board[2][1] && board[2][0] == board[2][2] && board[2][0] != ' ' ||
        board[0][0] == board[1][0] && board[0][0] == board[2][0] && board[0][0] != ' ' ||
        board[1][0] == board[0][0] && board[1][0] == board[2][0] && board[1][0] != ' ' ||
        board[2][0] == board[0][0] && board[2][0] == board[1][0] && board[2][0] != ' ' ||
        board[0][1] == board[1][1] && board[0][1] == board[2][1] && board[0][1] != ' ' ||
        board[0][2] == board[1][2] && board[0][2] == board[2][2] && board[0][2] != ' ' ||
        board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ' ||
        board[2][0] == board[1][1] && board[2][0] == board[0][2] && board[2][0] != ' ' ){
      printBoard(); // Call back board
      changeXO(); // Call back change of X and O
      System.out.println("Player " + xo + " is the winner!");
    }
        else{        
          
        }
      return false;
  }//end of checkWinner
  
 
}//end class