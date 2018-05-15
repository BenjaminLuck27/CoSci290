/*
Benjamin Luck 
CoSci290 
2D Arrays
*/
public class Testing2DArrays{
  
  //main method
  public static void main(String[] args){
    
      //declare 2D array 
      String[][] words = new String [3][2]; 
      /*
      {
      (null , null),
      (null , null),
      (null , null)
      }
      */
    //assign first element in 2d array
      words [0][0] = "cat";
    // get element in 2d array 
      System.out.println(words[0][0]);
      System.out.println(words[0][1]);
    
     //iterate through array 
      for(int i = 0; i < words.length; i++){ //goes through each row 
        for(int j = 0; j < words[i].length; j++){  //gows though each column
          words[i][j] = i * j + " cats";       
          System.out.println(words[i][j]);//print
          }
      }
    // Use custom function
   System.out.println(print2DArray(words));
    
    }//end main 
  //this method comcentrates all elements in a 2d array 
  public static String print2DArray(String[][] array){
    String concat = "";
    for(int i = 0; i < array.length; i++){
      for(int j = 0; j < array[i].length; j++){
        concat = concat + array[i][j] + " "; 
      }
    }
  return concat;
  }
  }//end class