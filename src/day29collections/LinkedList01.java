package day29collections;

import java.util.ArrayList;
import java.util.LinkedList;

/*
1) LinkedList’ler index kullanmazlar bu yuzden node ekleme ve silme islemlerinde tekrar indexleme yapilmaz.
2)LinkedList’lerde node ekleme ve silme islemleri yaparken sadece pointer’lari degistirir.
3)LinkedList'ler node silme ve ekleme de cok basarili olduklari icin, silme ve ekleme islemlerini coklukla yapacaginiz zaman
  LinkedList kullaniniz
4)ArrayList'ler index'leri adres gibi kullanir bu yuzden ArrayList'ler "search" islemlerinde cok basarilidirlar.
NOTE:Ihtiyaciniz olan collection cogunlukla silme ve ekleme islemleri yapacaksa(muze ziyaretcileri gibi)LinkedList,
     "search" islemleri yapacaksa(Amerika eyaletleri gibi)ArrayList kullaniniz.
 */
public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Brad");
        s.add("Steve");
        s.add("Alan");
        s.add("Corper");
        s.add("Mike");
        s.add("Brad");
        s.add(2,"Chris");
        s.addFirst("Lebron");
        s.addLast("Stephan");


        System.out.println(s); //[Lebron, Steve, Alan, Chris, Corper, Mike, Brad, Stephan]

        // s.remove(2);//Alan

        // s.remove("Corper");//Corper

        //s.remove();//[Steve, Chris, Mike, Brad, Stephan]

        //System.out.println(s);

        //s.removeFirstOccurrence("Brad");
        System.out.println(s); //[Lebron, Steve, Chris, Alan, Corper, Mike, Brad, Stephan]

       //s.removeLastOccurrence("Brad");
        System.out.println(s);//[Lebron, Brad, Steve, Chris, Alan, Corper, Mike, Stephan]

        String r1 = s.peek();//Ilk elemani silmeden verir yani copy-paste yapar.
        System.out.println(r1);//Lebron
        System.out.println(s);

        /*
        Retrieves and removes the head (first element) of this list.
        Returns: the head of this list, or null if this list is empty
         */
       String r2 = s.poll();//Ilk elemani verir ve cut-paste yapar.
       System.out.println(r2);//Lebron
       System.out.println(s);

       /*
       Retrieves, but does not remove, the head (first element) of this list.
        Throws: NoSuchElementException – if this list is empty

       Note: peek(); ile element(); ikiside ilk elamani silmeden verir ama peek list bos oldugunda null degeri döndürür,
       element() ise Hata verir.
        */
      String r3 = s.element();
      System.out.println(r3);
        System.out.println(s);


        /*
        Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.
        Returns:the element at the front of this list (which is the top of the stack represented by this list)
        Throws: NoSuchElementException – if this list is empty
        Note: pole(); ile pop(); ikiside ilk elamani siler ve  verir ama poll list bos oldugunda null degeri döndürür,
        pop() ise Hata verir.

         */
        String r4 = s.pop();
        System.out.println(r4);
        System.out.println(s);
    }
}
