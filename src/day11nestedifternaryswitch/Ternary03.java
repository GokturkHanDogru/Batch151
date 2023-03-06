package day11nestedifternaryswitch;
import  java.util.Scanner;
public class Ternary03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year");

        int year = input.nextInt();

       String isLeap = year%100 == 0 ? (year%400==0 ? "L  eap":"not Leap"): (year%4 == 0 ? "Leap":"not Leap");
        System.out.println(isLeap);

    }




    /*
    int year;
            boolean isLeapYear;
            String message;

            Scanner input = new Scanner(System.in);
            System.out.print("Write a Year: ");
            year = input.nextInt();
            input.close();

            if (year < 0) {
                System.out.println("Year Should be greater then 0");
            } else {
                if (year % 100 == 0) {
                    isLeapYear = (year % 400) == 0 ? true : false;
                } else {
                    isLeapYear = (year % 4) == 0 ? true : false;
                }

                message = isLeapYear ? " is a Leap Year" : " is not a Leap Year!";
                System.out.println(year + message);
            }
     */
}
