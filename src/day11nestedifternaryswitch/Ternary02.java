package day11nestedifternaryswitch;
import  java.util.Scanner;
public class Ternary02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num = input.nextInt();
        String result = num>0 ? "positive":"negative";
        System.out.println("result: "+result);
    }
}
