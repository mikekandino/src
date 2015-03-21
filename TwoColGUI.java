import javax.swing.*;
import java.awt.*;

/*
 Name: Moshe Kandino. March 6th, 2015
 */
public class TwoColGUI extends JFrame {


    public TextArea text1;
    public TextArea text2;

    public TwoColGUI(String title, int width, int height){


        text1 = new TextArea();
        text2 = new TextArea();

        setTitle(title);
        setSize(width,height);
        add(text1);
        add(text2);
        text1.setBackground(Color.CYAN);
        text2.setBackground(Color.LIGHT_GRAY);
        

        
        setLayout(new GridLayout(1,2));

        setVisible(true);

    }


}