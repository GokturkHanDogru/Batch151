package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_03 {
    /*
    Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

Note: Upper and lower case letters, spaces and special characters will not be changed.

Input :

It is very nice to write code.

Output :

.edoc etirw ot ecin yrev si tI
     */
    public static void main(String[] args) {

        String s = "It is very nice to write code.";

        StringBuilder revS = new StringBuilder(s);
        revS.reverse();

        System.out.println(revS);

    }
}
