package replit;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class For_While_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       /* String str="Javaisalsoeasy";
        char newStr [] =str.toCharArray();x
        char result [] = {};
        int count;
        Arrays.sort(newStr);

        for(int i =0; i< newStr.length;i++){
            count =1;
            for (int j=i+1; j< newStr.length;j++){
                if (newStr[i]==newStr[j]){
                    count++;
                    newStr[j] = '0';
                }
            }
            if (count>1 && newStr[i]!='0'){



            }
        }*/



                String str = "Javaisalsoeasy";
                String result = "";

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if ((str.indexOf(ch) != str.lastIndexOf(ch)) && (!result.contains("" + ch))) {
                        result += ch;
                    }
                }
                System.out.println(result +"  ");
    }
}
