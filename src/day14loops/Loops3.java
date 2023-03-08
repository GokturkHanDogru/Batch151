package day14loops;

import java.util.Scanner;

public class Loops3 {
    public static void main(String[] args) {
        int i = 1;
         while (i<1){
             System.out.println("While Loop");
             i++;
         }
        int k =1;

         do{
             System.out.println(" do while loop");
         }while(k<1);


        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please enter an integer");
            int n = input.nextInt();

            if(n<100){
                System.out.println("Won!");
            }else{
                System.out.println("Lost!");
                break;
            }
        }while(true);


        do {

            System.out.println("please write a word");
            String s = input.next();

            if (s.endsWith(".")&& (s.charAt(0)>='A' && s.charAt(0)<='Z')) {
                System.out.println("Your sentence gramatically correct!");
            }else {
                System.out.println("Your sentence gramatically wrong!");
                break;
            }
        }while (true);

    }

}
