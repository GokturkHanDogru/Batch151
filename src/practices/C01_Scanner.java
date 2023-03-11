package practices;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 12345;
/** First Way **/
        int lastDigit = num % 10;
        num = num /10;
        int lastSecondDigit = num % 10;
        num = num /10;
        int lasdtThirdDigit = num % 10;
        num = num / 10 ;
        int lastFourthDigit = num % 10;
        num = num / 10;
        int lastFifthDigit = num % 10;
        System.out.println(lastDigit+lastSecondDigit+lastFourthDigit+lastFifthDigit);




        //My Method

        System.out.println("Write a number with five digit!");
        int sayi = input.nextInt();
        int newNumber =0;
        int sum = 0;



        for (int i = 1; i<=5;i++){
            if (i==3) {
                continue;
            }
            else{
                 newNumber=(sayi%(10));
               // System.out.println(newNumber);

                 sum += newNumber;


                 sayi=(sayi/10);
              //  System.out.println(sayi);

            }

        }

        System.out.println("**********");
        System.out.println(sum);
        //System.out.println(Math.round(sum));

    }
}
