package replit;

import java.util.Arrays;

public class For_While_5 {
    public static void main(String[] args) {
        int x=20;


        for (int i =x; i>=0;  i--) {
            if (i % 2 == 0) {
                System.out.print("Even Numbers from 20 to 0 are: "+i + " ");
            }
            else {
                System.out.println();
            }
        }
    }
}
