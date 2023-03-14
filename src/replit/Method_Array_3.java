package replit;
/*
Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

input : ade1r4d3

output : 8

         Hint :
         Use Character.isDigit()
         Integer.valueOf()
 */
public class Method_Array_3 {
    public static void main(String[] args) {

        String x = "ade1r4d3";
        int sum =0;

        for (int i = 0 ; i<x.length();i++){
            if (Character.isDigit(x.charAt(i))){
                String tmp = x.substring(i,i+1);
                sum += Integer.valueOf(tmp);
            }
        }
        System.out.println(sum);

    }
}
