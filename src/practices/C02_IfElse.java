package practices;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C02_IfElse {
    public static void main(String[] args) {

        System.out.println("Write a Word:");
        Scanner input = new Scanner(System.in);

        String word = input.next();

        if (word.length()<=3){
            System.out.println("You should retype a new word more than 3 character!");
        }
        else {
            String lastThreeChar= word.substring(word.length()-3);
            System.out.println(lastThreeChar);
            System.out.println(lastThreeChar+word+lastThreeChar);

        }
    }
}
