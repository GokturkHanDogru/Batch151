package replit;

import java.util.Arrays;

public class Method_Array_2 {
    /*
    Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

Input  : Coding is greate.

Output : .etaerg si gnidoC
     */
    public static void main(String[] args) {


        String x = "Coding is greate.";
        String arr []= x.split("") ;
        String newArr [] = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {

            newArr[arr.length - i - 1] = arr[i];

        }
        for (int j =0 ; j<newArr.length;j++){
           System.out.print(newArr[j]);
        }


    }
}
