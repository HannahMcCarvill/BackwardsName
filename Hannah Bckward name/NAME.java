import java.io.*;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.math.*;

public class NAME
{
    // instance variables - replace the example below with your own
    private String vName;
    private String reverse;
    public NAME()
    {
        // initialise instance variables
        vName="";
        reverse = "";
    }

    public void enterName()
    {

        vName = JOptionPane.showInputDialog("Please enter your name:");
        int length = vName.length();
        System.out.println(vName);  
        System.out.println(length);

        for ( int i = length - 1 ; i >= 0 ; i-- )

        { reverse = reverse + vName.charAt(i);

            
        }
        System.out.println(reverse);
    } 

}

