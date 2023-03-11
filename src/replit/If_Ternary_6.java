package replit;

import java.util.Scanner;

public class If_Ternary_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Write Word with a 3 Character: ");
        String word = input.next();


            if (word.charAt(0) == word.charAt(1) || word.charAt(1) == word.charAt(2) || word.charAt(0) == word.charAt(2)){
                System.out.println("String has duplicate characters");
            }else {
                System.out.println("String has unique characters");
            }


    }
}
