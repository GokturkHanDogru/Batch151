package day30collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        // Ex 1: Ogrenci e-mail adreslerini  Natural Order'da siralanmis olarak depolayiniz.

        // 1.Way
        long t1 = System.nanoTime();
        TreeSet<String> email = new TreeSet<>();
        email.add("abc@gmail.com");
        email.add("abd@gmail.com");
        email.add("abi@gmail.com");
        email.add("aba@gmail.com");
        email.add("abl@gmail.com");
        email.add("abs@gmail.com");
        email.add("abz@gmail.com");
        email.add("abx@gmail.com");
        email.add("abö@gmail.com");
        email.add("abä@gmail.com");
        email.add("abe@gmail.com");

        System.out.println(email);//[aba@gmail.com, abc@gmail.com, abd@gmail.com, abe@gmail.com, abi@gmail.com, abl@gmail.com, abs@gmail.com, abx@gmail.com, abz@gmail.com, abä@gmail.com, abö@gmail.com]

        long t2 = System.nanoTime();
        //2.Way

        HashSet<String> emailHs = new HashSet<>();
        emailHs.add("abc@gmail.com");
        emailHs.add("abd@gmail.com");
        emailHs.add("abi@gmail.com");
        emailHs.add("aba@gmail.com");
        emailHs.add("abl@gmail.com");
        emailHs.add("abs@gmail.com");
        emailHs.add("abz@gmail.com");
        emailHs.add("abx@gmail.com");
        emailHs.add("abö@gmail.com");
        emailHs.add("abä@gmail.com");
        emailHs.add("abe@gmail.com");

        TreeSet<String> emailHsTs = new TreeSet<>(emailHs);//[aba@gmail.com, abc@gmail.com, abd@gmail.com, abe@gmail.com, abi@gmail.com, abl@gmail.com, abs@gmail.com, abx@gmail.com, abz@gmail.com, abä@gmail.com, abö@gmail.com]
        System.out.println(emailHsTs);
        long t3 = System.nanoTime();

        System.out.println(t2-t1);// TreeSet time
        System.out.println(t3-t2);//HashSet Time
    }
}
