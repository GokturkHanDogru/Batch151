package replit;

import java.util.Arrays;

/*
Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}

Input2=c

Output={1,2,3,4,5,6}
 */
public class Method_Array_8 {
    public static void main(String[] args) {

        int [] a = {1,2,3,4};
        int [] b = {5,6};
        System.out.println(Arrays.toString(merge(a,b)));
    }

    static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        for (int x : a) { c[i] = x; i ++; }
        for (int x : b) { c[i] = x; i ++; }
        return c;
    }


}
