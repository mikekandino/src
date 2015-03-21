import java.util.*;
/*
 Name: Moshe Kandino. March 6th, 2015
 */
public class TextGetterSorter {


    public TextFileInput reader;

    public TextGetterSorter(String textFileLocation){

        reader = new TextFileInput(textFileLocation);


    }


    public List<String> getWords() {

        String currentLine;
        List<String> lastN = new ArrayList<String>();
        List<String> firstN = new ArrayList<String>();

        List<int[]> playerNum = new ArrayList<String>();
//       int[] playerNumInt = new int[];
      //  float[] playerBat = new float[];
        
        
        int splitter=0;
        while ((currentLine = reader.readLine()) != null) {

             String[] x  = currentLine.split(",");
             
             for(int i = 0; i < x.length; i++) {
            // if (splitter==0) {
                	playerNum.add(x[i]);
               
             /*      
                
                splitter++;

			if (splitter==4) {
				splitter=0;   
             } 
            */
            	 
             }// end for
             
        }
        return playerNum;
    }

/*
if (splitter==1) {
	lastN.add(x[i]);
}

if (splitter==2) {
	firstN.add(x[i]);
}

if (splitter==3) {
	playerBat.add(x[i]);
}


}

*/

    public List<String> alphabetize(List<String> currentColumn){

        List<String> playerNum =  currentColumn;

        for (int i = 1; i < currentColumn.size() ; i++) {

            String currentWord  = currentColumn.get(i);
            String previousWord = currentColumn.get(i - 1);

            if(currentWord.compareTo(previousWord) < 1){

                playerNum.set(i - 1, currentWord);
                playerNum.set(i,previousWord);
                i = 0;
                continue;
            }
        }

        return playerNum;
    }
}