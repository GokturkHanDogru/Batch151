package practices;

import java.util.Scanner;

public class Day02BlanksPracticeForCharAt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Write Your Name");
        String name = input.nextLine();

        char nameFirstChar = name.charAt(0);
        char surnameFirstChar = name.charAt(name.indexOf(" ")+1);
    }
}
