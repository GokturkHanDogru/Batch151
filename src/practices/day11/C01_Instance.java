package practices.day11;

public class C01_Instance {
    int sayi; //0
    String isim; //null
    boolean ogrenciMi; //false

    public static void main(String[] args) {
        /*

    sayi, isim, ogrenciMi seklinde dort tane instance variable olusturalım.
    Bu instance variable'lerin default degerlerini main icerisinde yazdıralım

*/
    C01_Instance obj1 = new C01_Instance();

        System.out.println(obj1.sayi); //0
        System.out.println(obj1.isim); // null
        System.out.println(obj1.ogrenciMi); //false


    C01_Instance obj2 = new C01_Instance();

    obj1.isim="Hasan";
    obj2.isim="Ali";
        System.out.println(obj1.isim);



    }
}
