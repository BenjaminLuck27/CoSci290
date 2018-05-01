/*
Benjamin Luck 
CoSci 290 
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class TestFileIO{

  public static void main(String[] args){
    
    String currentLine; // hold current line being read in file 
    String filename = "Test.txt"; // hold the relative path of a file 
    
    try(BufferedReader br = new BufferedReader(new FileReader(filename))){
    
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
    }
    
    }catch(IOException e){
      e.printStackTrace();
    }
    
  } //end main method
  
} 
