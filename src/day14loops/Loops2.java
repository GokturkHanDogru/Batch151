package day14loops;

import java.util.Scanner;

public class Loops2 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        // from 3 to 8 write all of the integer values

        int i=3;

       while (i<9){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();

        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz


       int k=21;
       while (k<181){
           if (k%4 == 0 && k%6 == 0){
               System.out.print(k +" ");

           }
           k++;
       }
        System.out.println();

//Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI

        String s = "miami";
        int m = 0;

        while (m<s.length()){
        String ch = s.substring(m,m+1);

        if (m%2==0){
            System.out.print(ch.toUpperCase());
        }else {
            System.out.print(ch);
        }
            m++;
        }
        System.out.println();

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20

        int r =-578;
        r=Math.abs(r);
        int sum=0;

        while (r>0){

            sum =sum + r%10;

            r=r/10;
        }
        System.out.println(sum);


        //Kullanicidan aldiginiz String'deki sessiz harfleri console'a yazdiran kodu yaziniz
        //Alabama ==> lbm

        System.out.println("Please enter a word");
        String y = input.next();
        int z = 0;

        while (z<y.length()){
            char ch = y.charAt(z);

            boolean x = ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
            if(!x) {
                System.out.print(ch);
            }
            z++;
        }





    }
}
