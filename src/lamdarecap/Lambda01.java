package lamdarecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftPozitifSayiYazdir(sayi);
        System.out.println();
        ciftPozitifSayiYazdir2(sayi);
        System.out.println();
        kareleriniYazdir(sayi);
        System.out.println();
        kareleriniYazdir2(sayi);
        System.out.println();
        siralaYazdir(sayi);
        System.out.println();
        pozitifKupBes(sayi);
        System.out.println();
        toplamBulYazdir(sayi);
        System.out.println();
        toplamLamdaEx(sayi);
        System.out.println(ciftElKareKucBuySirListReturn(sayi));


    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftPozitifSayiYazdir(List<Integer> sayi){
        sayi.
                stream().
                filter(t-> t>0 && t%2 == 0).
                forEach(t-> System.out.print(t+" "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftPozitifSayiYazdir2(List<Integer> sayi){
        sayi.
                stream().
                filter(t-> t>0 && t%2 == 0).
                forEach(Utils::yazdir);
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareleriniYazdir(List<Integer>sayi){
        sayi.
                stream().
                map(Utils::getSquare).
                forEach(Utils::yazdir);
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareleriniYazdir2(List<Integer>sayi){
        sayi.
                stream().
                map(Utils::getSquare).
                distinct().
                forEach(Utils::yazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void siralaYazdir(List<Integer>sayi){
        sayi.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::yazdir);
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBes(List<Integer>sayi){
        sayi.
                stream().
                filter(t-> t>0).
                map(t-> t*t*t).
                filter(t-> t%10==5).
                forEach(Utils::yazdir);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void toplamBulYazdir(List<Integer>sayi){
        int sonuc = sayi.stream().reduce(Integer::sum).get();
        System.out.println(sonuc);
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void toplamLamdaEx(List<Integer> sayi){
       int sonuc = sayi.stream().reduce(0,(a,b)->a+b);
        System.out.println(sonuc);
    }
    //SORU9 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftElKareKucBuySirListReturn(List<Integer> sayi){
       return sayi.stream().filter(t-> t%2==0).map(Utils::getSquare).sorted().collect(Collectors.toList());
    }

}

