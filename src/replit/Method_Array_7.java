package replit;
/*

Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.


Eg :

input : {1,2,3,4,5,6,7,8};

output: 36
 */
public class Method_Array_7   {
    public static void main(String[] args) {


        int [] arr = {1,2,3,4,5,6,7,8};
        sum(arr);

    }

    public  static void sum(int [] arr ){

        int sum =0;
        int [] input = {1,2,3,4,5,6,7,8};

        for (int i=0; i<input.length; i++){
            sum +=input[i];

        }
        System.out.println(sum);

    }
}
