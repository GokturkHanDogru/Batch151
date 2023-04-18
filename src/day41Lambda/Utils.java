package day41Lambda;

public class Utils {


    public static int getSumOfDigits(int a){

        int sum = 0;

        while(a>0){

            sum = sum + a%10;

            a = a/10;
        }

        return sum;
    }
}
