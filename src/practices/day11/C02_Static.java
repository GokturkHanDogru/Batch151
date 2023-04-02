package practices.day11;

public class C02_Static {
    static  String okulIsmi ="Yildiz Koleji";
    static int  okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {

        /*
    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım
        */

        System.out.println(okulAcikMi); //false
        System.out.println(okulNo); //0
        System.out.println(okulIsmi); //Yildiz Koleji

    }
}
