package day33maps;

import java.util.Hashtable;

public class HashTable01 {
    /*
    HashMap ile HashTable arasindaki fark nedir?

     i)"HashMap" "thread-safe" degildir, "HashTable" "thread-safe" dir.
       "HashMap" "synchronized" degildir, "HashTable" "synchronized" dir.
     ii)"HashMap" bir tane "null" key'e ve istediginiz kadar "null" value'e musaade eder.
        "HashTable" key'lerde ve value'larda da "null" kullanilmasina musaade etmez
        iii)"HashMap" hizlidir, "HashTable" "HashMap"e gore yavastir.
        Note: "HashMap" ve "HashTable" ikisi de entry'lero rastgele siralar
     */

    public static void main(String[] args) {


        Hashtable<String,Integer> stdAges = new Hashtable<>();
        stdAges.put("Tom",43);
        stdAges.put("Jim",52);
        stdAges.put("Jack",21);
        stdAges.put("Henry",43);
        stdAges.put("Walker",85);
        //stdAges.put(null,85); Hash table'in key'ine null konulmaz
        //stdAges.put("Chris",null); ==> HashTable'larin value'larina null konulamaz


    }
}
