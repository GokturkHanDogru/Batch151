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
        double sayi = input.nextInt();
        double newNumber =0;
        double sum = 0;



        for (int i = 1; i<=5;i++){
            if (i==2) {
                continue;
            }
            else{
                 newNumber=(sayi%(10));
                System.out.println(newNumber);

                 sum += newNumber;
                sayi=(sayi/Math.pow(10,i));
                System.out.println(sayi);

            }

        }

        System.out.println("**********");
        System.out.println(sum);
        System.out.println(Math.round(sum));

    }
}
