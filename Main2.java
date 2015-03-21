import java.io.File;
import java.util.*;
/*
Name: Moshe Kandino. March 6th, 2015
*/

public class Main2 {



    public static TwoColGUI GUI;
    public static BaseballPlayer TextReader;
    public static List<String> lastName;
    public static List<String> firstName;
    public static List<String> rightColumn;

    public static void main(String[] args) {


        GUI        = new TwoColGUI("Project 1 - Two Column Word Sorting GUI",600,600);
        TextReader = new BaseballPlayer("words.txt");



        lastName = TextReader.getLastN();
 //      firstName = TextReader.getFirstN();
        
      GUI.text1.append("Text extracted from words.txt, \nsplit & unsorted: \n\n\n");
      GUI.text2.append("Text extracted from words.txt, \nsplit & alphabetically sorted: \n\n\n");

      int fPL=0;
        for (int i = 0; i < lastName.size() ; i++) {

            GUI.text1.append(lastName.get(i) + ", ");
        
            fPL++;
        if (fPL==4) {
        	
        	GUI.text1.append("\n");
        	fPL=0;	
        	} // end if
        } // end for

        rightColumn = TextReader.alphabetize(lastName);
    	fPL=0;	
        for (int z = 0; z < rightColumn.size() ; z++) {

            GUI.text2.append(rightColumn.get(z)+", ");
            
            fPL++;
            if (fPL==4) {
            	GUI.text2.append("\n");
            	fPL=0;	
            	} // end if
        } // end for

    } // end main

	private static void takeInputArray(File f) {
		// TODO Auto-generated method stub
		
	}

} // end class main2