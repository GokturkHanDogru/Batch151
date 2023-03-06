package day11nestedifternaryswitch;
import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers...");

        int first = input.nextInt();
        int second = input.nextInt();



       int result =  first<second ? first : second;
        System.out.println("Smallest number is : "+result);
    }
}
