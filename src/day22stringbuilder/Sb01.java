package day22stringbuilder;

public class Sb01 {
     /*
            1) "StringBuilder" String ureten bir Class'dir.
            2) String Class kullanarak String uretiriz Java nicin "StringBuilder" Class'ida olusturdu.
               "String " Class "immutable" (degistirilemez) String uretir. "StringBuilder" Class "mutable" (degistirilebilir) String uretir.
            3) "immutable" olmak demek orjinal degerin korunmasi, degistirilemez olmasi demektir.
                "mutable" olmak demek orjinal degerin degistirilebilir olmasi demektir.
            4) "capacity" Java'nin size verdigi data depolama yer sayisidir.
                Length ise size verilen data depolama yerinin kullanilan kismidir.
            5)  Java baslangic olarak size capacity'i 16 olarak verir.
                Size verilen capacity'i asarsaniz Java yeni capacity'i varolanin 2 katinin 2 fazlasi olacak sekilde degistirir.

         */

    public static void main(String[] args) {

        String s = "Java";

        s = s + "!";

        String u = "Apex";
        String v = "Apex";
        String y = "C++";

        //StringBuilder nasil olusturulur?
        //1.Way:
        StringBuilder t = new StringBuilder("Python");
        System.out.println(t);//Python

        //StringBuilder'lara nasil ekleme yapilabilir?
        t.append("!").append("..");
        System.out.println(t);//Python!..
//2.Way:
        StringBuilder r = new StringBuilder();

        r.append('c');
        System.out.println(r);

        //"capacity" ve "length" arasindaki fark nedir?

        StringBuilder sb1 = new StringBuilder("Money");

        int capacity = sb1.capacity();
        System.out.println(capacity);//21

        int length = sb1.length();
        System.out.println(length);//"Money" ==> 5 karakter sayisini verir.

        sb1.append("!");

        int c = sb1.capacity();
        System.out.println(c);//21x2 + 2 ==>44

        int ln = sb1.length();
        System.out.println(ln);//23

        //Default capacity'i degistirebiliriz ?
        StringBuilder sb2 = new StringBuilder(2);
        System.out.println(sb2.capacity());//2

        sb2.append("...");
        System.out.println(sb2.capacity());//6


    }
}
