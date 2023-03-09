package practices;

import java.util.Scanner;

public class C03_IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Write two words:");
        System.out.print("First word:");
        String first = input.next();
        System.out.println("Second word:");
        String second = input.next();

        if (first.length()%2 == 0){
            String halfFirst = first.substring(0,first.length()/2);
            String halfSecond = first.substring((first.length()/2));
            System.out.println(halfFirst+second+halfSecond);
        }else {
            System.out.println("Your word has an odd length");
        }

    }
}
