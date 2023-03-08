package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write number of elements!");
        int numOfElements = input.nextInt();

        String stdNames [] = new String [numOfElements];

        System.out.println("To stop adding press 'q'");

        for (int i = 0; i< stdNames.length;i++){
            System.out.println("Enter the " + (i+1) + ". student name");

            String name = input.next();

            if(name.equalsIgnoreCase("q")){
                break;
            }else{
                stdNames[i] = name;
            }

        }
        System.out.println(Arrays.toString(stdNames));

    }

}

