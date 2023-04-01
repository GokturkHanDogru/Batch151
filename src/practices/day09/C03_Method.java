package practices.day09;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Method {
    public static void main(String[] args) {

        /*
        kullanıcıdan bir cumle sisteme girmesini isteyiniz.
        method olusturarak cumlede gecen sesli harfleri konsola yazdırınız
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir cumlu giriniz");
        String cumle = scan.nextLine();

        String arr[] = cumle.split("");

        System.out.println(Arrays.toString(arr));


        sesliharfleriyazdir(arr);


    }

    public static void sesliharfleriyazdir(String[] arr) {

        for (int i = 0; i <arr.length ; i++) { // 0'dan arr'in uzunluguna kadar donguye aldık

            if(arr[i].equalsIgnoreCase("a") // array elemanları sesli harf mi kontrol ettik
                    || arr[i].equalsIgnoreCase("e")
                    || arr[i].equalsIgnoreCase("i")
                    || arr[i].equalsIgnoreCase("o")
                    || arr[i].equalsIgnoreCase("u")){
                System.out.println(arr[i]); // sesli harf olanları yazdırdık
            }


        }



    }
}
