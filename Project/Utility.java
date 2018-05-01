/* 
Author Benjamin Luck 
CoSci 290
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

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
    public void writeFile(String CONTENT){
     String FileName = "PlayerInfo.txt";

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(CONTENT))){

			String content = CONTENT;

			bw.write(content);

			System.out.println(content);

		}catch(IOException ee){

			e.printStackTrace();
   }
  }
 }
}