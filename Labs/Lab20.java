/*
Benjamin Luck (Worked with Thomas Mak & Lynn Takahasi)
CoSci290 
2D Array Lab
*/
public class Lab20{

  public static void main(String[] args){
    // declaring Array 
    
    int[][] index = new int [5][6]; 
    for(int i = 0; i < index.length; i++){ //goes through each row 
       for(int j = 0; j < index[i].length; j++){  //gows though each column
        index[i][j] = 1 + (int)(Math.random() * 99) + 1;
         //System.out.println(index[i][j] + "");
        }
     }
    
    for (int row = 0; row < index.length; row++) {
            for (int col = 0; col < index[row].length; col++){

            }

        }           
     for (int row = 0; row < index.length; row++){
            for (int col = 0; col < index[row].length; col++){
                System.out.print(index[row][col] + " "); 
            }
            System.out.print("\n");
        }
    

     
    
  


    
  }//end main 
  
  
}// end class