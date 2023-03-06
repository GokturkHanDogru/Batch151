package day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        String stdNames[] = new String[5];
        System.out.println(Arrays.toString(stdNames));

        stdNames[0] = "Edgar";
        stdNames[1] = "Alan";
        stdNames[2] = "Poe";
        stdNames[3] = "Bendeict";
        stdNames[4] = "Cumbercat";

        System.out.println(stdNames[3]);

        for (int i=0;i< stdNames.length;i++) {
            System.out.println(stdNames[i] + "*");
        }

        //2.Way for-each loop -> Enhanced Loop
        for (String w : stdNames){
            System.out.println(w+"*");
        }

       // Array Calculation
        int ages [] =new int [5];
        ages [0]= 12;
        ages [1]= 22;
        ages [2]= 32;
        ages [3]= 9;
        ages [4]= 78;
        int sum = 0;

        for (int w : ages){
            sum = sum+w ;
        }
        System.out.println(sum);


        //Examples 3

        char initials [] = new char[3];

        initials[0] = 'J';//74
        initials[1] = 'P';//80
        initials[2] = 'A';//65

        int carpim = 1;
        //[J, P, A]
        for(char w : initials){
            carpim = carpim * w;
        }
        System.out.println(carpim);// 384800
    }


}

