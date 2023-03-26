package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_01 {
    /*
    Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

input :

Learning java is eas

output:

maximum occurring character is : a
     */
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String str = scanner.nextLine();

                // convert string to lowercase to ignore case sensitivity
                str = str.toLowerCase();

                int[] charCount = new int[str.length()]; // stores the count of each character in the string

                // iterate through the string and update the character count
                for (int i = 0; i < str.length(); i++) {
                    charCount[str.charAt(i)]++;
                }

                int maxCount = -1; // stores the maximum count of a character
                char maxChar = ' '; // stores the character with the maximum count

                // iterate through the character count array and find the maximum count and character
                for (int i = 0; i < 256; i++) {
                    if (charCount[i] > maxCount) {
                        maxCount = charCount[i];
                        maxChar = (char) i;
                    }
                }

                System.out.println("Maximum occurring character is: " + maxChar);

                scanner.close();
            }
        }





