package day11nestedifternaryswitch;
import java.util.Objects;
import  java.util.Scanner;
public class Ternary04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = input.nextInt();

       Object result =  num%2 ==0 ? (num/2):("Even number");
        System.out.println("result = " + result);

    }
}
