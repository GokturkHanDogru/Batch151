package replit;

import java.util.Arrays;

/*
Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output :

min: 1

max: 6
 */
public class Method_Array_6  {
    public static void main(String[] args) {

        int [] input = {3,2,5,4,1,6};
        Arrays.sort(input);
        System.out.println("min: "+input[0]);
        System.out.println("max: "+input[input.length-1]);

    }
}
