package day32maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {

        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Ajda",77);
        stdAges.put("Ezhel",38);
        stdAges.put("Tom",76);
        stdAges.put("Brad",58);
        stdAges.put("Angelina",58);
        //"key"i tekrarli kullandigimizda hata vermez sadece en son verileni kabul eder.
        //Bu yontem value guncellemede kullanilabilir. Bu isleme "overwrite" denilir
        stdAges.put("Tom",83);


        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezhel=38}

        stdAges.replace("Ezhel",39);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezhel=39}

        //replace("Angelina", 57,61); methodu map icinde "Angelina" 57 varsa 57ì 61e dönüstürür, yoksa donusturmez.
        stdAges.replace("Angelina", 57,61);
        System.out.println();



        //putIfAbsent("Ali",60) methodu map`de "Ali" key olarak yoksa Mape " Ali=60"i ekler, varsa eklemez.
        stdAges.putIfAbsent("Ali",60);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezhel=39, Ali=60}


        //getOrDefault("Ayse", 0); methodu Map'de varolan "key"ler icin "get() methodu" ile ayni ciktiyi verir.
        //getOrDefault("Ayse", 0); methodu Map'de olmayan "key"ler icin ikinci parametreye koydugunuz degeri
        // "get() methodu" ise null verir.
        System.out.println(stdAges.get("Tom"));//83
        System.out.println(stdAges.getOrDefault("Tom",0));//83

        System.out.println(stdAges.get("Ayse"));//null
        System.out.println(stdAges.getOrDefault("Ayse",0));//0


        //containsValue(77); methodu value'lari icerisinde olup olmadigini kontrol eder.
        System.out.println(stdAges.containsValue(77));//true
        System.out.println(stdAges.containsValue(99));//false
        System.out.println(stdAges.containsKey("Ali"));


        stdAges.remove("Ali");
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezhel=39, Ali=60}

        //remove("Tom", 81); methodu Map'de key'si "Tom", value'su 81 olan bir entry varsa onu siler, yoksa silmez
        stdAges.remove("Tom", 81);
        System.out.println(stdAges);//{Tom=83, Angelina=58, Ajda=77, Brad=58, Ezel=39}


        HashMap<String,Integer> kidsAge = new HashMap<>();

        kidsAge.put("John",12);
        kidsAge.put("Jim",22);
        kidsAge.put("Jack",32);

        stdAges.putAll(kidsAge);
        System.out.println(stdAges);//{Tom=83, Angelina=58, John=12, Ajda=77, Brad=58, Jack=32, Ezhel=39, Jim=22}
        System.out.println(kidsAge);//{John=12, Jack=32, Jim=22}
    }
}
