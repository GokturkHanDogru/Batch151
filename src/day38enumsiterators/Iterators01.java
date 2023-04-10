package day38enumsiterators;

import java.util.*;

public class Iterators01 {
    /*
    1)Iterator'lar loop'larin yaptigi ayni isi yapar.
    2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
    3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
    4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basarilidir.
    5)Iki tip iterator var; i) Iterator: Bu sadece eleman silmede kullanilir, eleman eklemek veya degistirmek mumkun degildir.
                            ii)ListIterator: Bu eleman silebilir, ekleyebilir ve degitirebilir.
                            Note:"Iterator" sadece soldan saga (ilk elemandan son elemana) calisir.
                                     "ListIterator" ise iki yonlu calisabilir
     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); //[Tom, Jim, Clara, Angie, Mark]


        //Iterator Kullanimi
        Iterator<String> myItr = myList.iterator();

        while (myItr.hasNext()){

            myItr.next();

            myItr.remove();
        }
        System.out.println(myList);//[]


        //ListIterator Kullanim
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList); //[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){

            String el = yourListItr.next();

            yourListItr.set(el+"!");
        }
        System.out.println(yourList);//[Tom!, Jim!, Clara!, Angie!, Mark!]

        // hasPrevious() ve previous() nasil kullanilir?
        while (yourListItr.hasPrevious()){
           String el  =  yourListItr.previous();
           yourListItr.set("?"+el);
        }
        System.out.println(yourListItr);//[?Tom!, ?Jim!, ?Clara!, ?Angie!, ?Mark!]

        //En sondan en basa nasil iterate edebiliriz?
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList); //[Tom, Jim, Clara, Angie, Mark]

        Iterator<String> ourListItr = ourList.descendingIterator(); // descendingIterator() ancak LinkedList ile kullanilabilir.

        while (ourListItr.hasNext()){
            String el = ourListItr.next();
            System.out.println(el);
        }

    }
}
