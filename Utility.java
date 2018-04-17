/* 
Author Benjamin Luck 

*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Utility {
  /*
this method opens a file and prints out each line 
  */
  public void readFile(String Filename){
   
    
    String currentLine; // hold current line being read in file 
   
    
    try(BufferedReader br = new BufferedReader(new FileReader(Filename))){
    
      while((currentLine = br.readLine()) != null){
        System.out.println(currentLine);
    }
    
    }catch(IOException e){
    e.printStackTrace();
  }
 } 
}