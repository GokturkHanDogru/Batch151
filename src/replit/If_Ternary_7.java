package replit;

import java.util.Scanner;

public class If_Ternary_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       // System.out.println("Please Write 2 Names: ");
        String name1 = input.next();
        String name2 = input.next();

        if (name1.length()%2 ==0){
            String firstPart = name1.substring(0,name1.length()/2);
            String secondPart = name1.substring((name1.length()/2),name1.length());
            System.out.println(firstPart+name2+secondPart);
        }else {
            System.out.println("Name2 cannot be inserted in the name1");
        }

    }
}
