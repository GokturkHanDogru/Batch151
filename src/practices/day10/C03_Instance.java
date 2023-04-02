package practices.day10;

public class C03_Instance {
    /*

sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
Bu instance variable'leri main icerisinde yazdıralım

*/
    public static void main(String[] args) {

    C03_Instance obj = new C03_Instance();
        System.out.println(obj.sayi);
        System.out.println(obj.bransIsmi);
        System.out.println(obj.okuldaMi);

        // instance variablelar objeye baglidir
        //hangi obje üzerinden variable'da degisiklik yapildiysa, yapilan bu degisiklik sadece objeyi baglar

        obj.sayi=10;
        System.out.println(obj.sayi); // 10


        C03_Instance obj2 = new C03_Instance();
        System.out.println(obj2.sayi); // 0

        obj.bransIsmi = "SQL";
        System.out.println(obj.bransIsmi); //SQL
        System.out.println(obj2.bransIsmi); //Java



    }

     int sayi;//  0
    String bransIsmi = "Java";
    boolean okuldaMi; // false
}
