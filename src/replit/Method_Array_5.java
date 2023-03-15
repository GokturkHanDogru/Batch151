package replit;
/*
Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
 */
public class Method_Array_5 {
    public static void main(String[] args) {

        int input[]= {1,2,3,4,5,6,7};
        int sum =0;
        int value;
        int average=0;


        for (int i = 0; i<input.length; i++){
            sum +=input[i];
            average = sum/input.length;

    }
        System.out.println(average);
    }

}
