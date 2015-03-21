import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
/*
Name: Moshe Kandino. March 6th, 2015
*/
public class BaseballPlayer {
	
	 public TextFileInput reader; 
	    public BaseballPlayer(String textFileLocation){
	        reader = new TextFileInput(textFileLocation);
	    }
	    
  
  

    public List<String> getLastN() {

        String currentLine;
   //     List<String> lastN = new ArrayList<String>();
        List<String> firstN = new ArrayList<String>();

        List<String> lastN = new ArrayList<String>();
//       int[] playerNumInt = new int[];
      //  float[] playerBat = new float[];
        
        
        int splitter=0;
        while ((currentLine = reader.readLine()) != null) {

             String[] x  = currentLine.split(",");
             for(int i = 0; i < x.length; i++) {
            	// if (splitter==1) {
                	lastN.add(x[i]);
            // }
              //      splitter++;

        		//	if (splitter==4) {
        			//	splitter=0;   
                     //} 
                    
             }// end for
             
        } // end while
        return lastN;	
        
    } // while getWords
    
    
    
  /*  
   public List<String> getFirstN() {


        String currentLine;
        List<String> firstN = new ArrayList<String>();    	
    int splitter=0;
    while ((currentLine = reader.readLine()) != null) {

         String[] x  = currentLine.split(",");
         for(int i = 0; i < x.length; i++) {
        	 if (splitter==3) {
            	firstN.add(x[i]);
         }
                splitter++;

    			if (splitter==4) {
    				splitter=0;   
                 } 
                
         }// end for
         
    } // end while
    return firstN;
} // while getWords
*/
    
    
    
    public List<String> alphabetize(List<String> currentColumn){

        List<String> playerNum =  currentColumn;

        for (int i = 6; i < currentColumn.size() ; i++) {

            String currentWord  = currentColumn.get(i);
            String previousWord = currentColumn.get(i - 4);
            char st1 = currentWord.charAt(0);
            char st2 = previousWord.charAt(0);
            if(st1 > st2){

                playerNum.set(i - 4, currentWord); // 2 go to 6 last name
                playerNum.set(i,previousWord); // 6 go to 2 last name
                /*
                i = 5;
                currentWord  = currentColumn.get(i);
                previousWord = currentColumn.get(i - 4);
                
                playerNum.set(i - 4, currentWord); // player number
              	playerNum.set(i,previousWord); // player number
                i = 7;
                playerNum.set(i - 4, currentWord); // first name
                playerNum.set(i,previousWord); // first name
                
                i = 8;
                playerNum.set(i - 4, currentWord); // float
                playerNum.set(i,previousWord); // float
           */     
                
                i = 6;
                
                continue;
            }
        }

        return playerNum;
    }
    

} // end class BaseballPlayer