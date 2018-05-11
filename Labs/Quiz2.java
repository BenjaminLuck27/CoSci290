/*
Benjamin Luck 
CoSci 290 
Quiz 2 Group 2 
*/

 public class Quiz2{
   
   public static void main(String[] args){
     
    //declare array 
    String[] letters = new String[8]; 
      
    // assign values to this array 
     letters[0] = "B";
     letters[1] = "E";
     letters[2] = "N";
     letters[3] = "J";
     letters[4] = "A";
     letters[5] = "M";
     letters[6] = "I";
     letters[7] = "N";
      
     
     
     for(int i = 0; i < letters.length; i++){
     System.out.println(+ i + ":" + letters[i]);
      }
     
     
    }//end main
   
   public static void secondary(String[] args){
    //declare array 
    String[] letters = new String[8]; 
      
    // assign values to this array 
     letters[0] = "B";
     letters[1] = "R";
     letters[2] = "I";
     letters[3] = "G";
     letters[4] = "E";
     letters[5] = "T";
     letters[6] = "T";
     letters[7] = "E";
      
     
     
     for(int i = 0; i < letters.length; i++){
     System.out.println(+ i + ":" + letters[i]);
      }
     return;
   }//end secondary
  }//end class