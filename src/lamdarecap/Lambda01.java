package lamdarecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));

        ciftPozitifSayiYazdir(sayi);
        System.out.println();


    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftPozitifSayiYazdir(List<Integer> sayi){
        sayi.stream().filter(t-> t>0 && t%2 == 0).forEach(t-> System.out.print(t+" "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftPozitifSayiYazdir2(List<Integer> sayi){
        //sayi.stream().filter(t-> t>0 && t%2 == 0).forEach();
    }


}
