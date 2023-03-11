package day18constructorsstatickeyword;

// "static blocklar" "static variablelara" ilk degerlerini vermek icin kullanilir
// static bir variablea deger atmak icin kod yamaniz gerekirse static block kullaniniz
// static bir variabla deger atamak icin yazilmasi gerekn kod main method icine de yazilabilir ama static block icine yazilan bi kod main methoddan önce calisir
// bir classda birden fazla static block varsa en üstteki ilk calisir

import java.time.LocalDate;

public class StaticNonStaticBlocks {


    // public variablelar static block kullanilmadan da initialize edilebilir
        public static double pi = 3.14;


        // public variablelar static block kullanilmadan da initialize edilebilir
    // Asagidaki gibi static bir variablea deger atmak icin kod yamaniz gerekirse static block kullaniniz
        public static double price;

    public static void main(String[] args) {
        System.out.println(" I'm main method ");
    }


static {
    System.out.println(" I'm static block 1 ");
    LocalDate d = LocalDate.now();
    if (d.getMonthValue() == 3) {
        price = 1000;
    } else {
        price = 1200;
    }
}
    static {
        System.out.println(" I'm static block 2 ");

    }
}

