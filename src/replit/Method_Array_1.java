package replit;

import java.util.Arrays;

public class Method_Array_1 {
    public static void main(String[] args) {
    int [] validData = {1,2,3,4,5};
    int [] newValidData =new int[validData.length];
        for(int i = 0; i < validData.length; i++) {

         newValidData [validData.length-i-1] = validData[i];
        }
        //System.out.println(Arrays.toString(newValidData));
        for (int j =0 ; j<newValidData.length;j++) {
            System.out.print(newValidData[j]);
        }
    }
}
