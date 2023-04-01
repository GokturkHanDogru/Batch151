package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Sets01 {
    /*
    1)set'ler tekrarsiz eleamn depolamak icin kullanilir.
    2)3 tane set class vardir;
        i)HashSet Class:
            Hash benzersiz id olusturma teknigidir. Bu teknige "Hashing Technique" denir
            HashSet elemanlari rastgele siralanir.
            HashSet eleamnlari rastgele siraladigindan cok hizli calisir.
            HashSet'ler null'i eleman olark kabul eder.

        ii)LinkedHashSet Class:
            LinkedHashSet'ler elemanlari sizin verdiginiz siraya göre dizdiklerinden HashSet'lere göre yavastirlar.

        iii)TreeSet Class:
            TreeSet'ler elemanlari Natural Order'a göre dizerler, bu yüzden cok yavastirlar
            En yavas settir.
    3)TreeSet cok yavas oldugundan mümkün oldugu kadar TreeSet kullanmamaya calisiriz.

     */
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("Ajda");
        hs.add("Cüneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add("Cüneyt");//Tekrarli eleman eklediginizde hata vermez ama tekrarli elemani sadece bir kere ekler.
        hs.add(null);

        System.out.println(hs);//[null, Zeki, Ajda, Cüneyt, Esra, Ezel]

        System.out.println(hs.hashCode());//2131540013


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        lhs.add(null);
        System.out.println(lhs);//[234, 87, -32, 124, null]

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);


        lhs.retainAll(ls);// insanlar-suclular=sucsuzlar
        System.out.println(lhs); // => ilk linked hashSet'teki elemanlar silindi.
        System.out.println(ls);


        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null); => TreeSet'lere null eklenemez.
        System.out.println(ts);//[A, G, R, U, Z]

        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z
        System.out.println(ts.lower('R'));//G R'den bir önceki degeri verir.
        System.out.println(ts.higher('R'));//U R'den bir sonraki degeri verir.

        System.out.println(ts.headSet('R'));// [A, G] R dahil olmadan R'ye kadar olan elemanlari yazdirir.
        System.out.println(ts.headSet('R',true)); /// [A, G, R] R'ye kadar olanlari almak icin. Method overloading var.

        System.out.println(ts.tailSet('G'));// [G, R, U, Z] G dahil ondan sonraki elemanlari yazdirir.
        System.out.println(ts.tailSet('G',false)); // [R, U, Z] G dahil olmamasi icin yatilmis bir method.

        System.out.println(ts.ceiling('R'));//R Eleman setin icinde var ise eleamnin kenidisi return eder, yok ise alfabetik sirada sonraki eleman return eder.
        System.out.println(ts.ceiling('K'));//R

        System.out.println(ts.floor('G'));//G Eleman setin icinde var ise eleamnin kenidisi return eder, yok ise alfabetik sirada önceki eleman return eder.
        System.out.println(ts.floor('J'));//G

        System.out.println(ts.subSet('G','Z'));//[G, R, U] ==> ilk parametre dahil ikincisi dahil.
        System.out.println(ts.subSet('G',false,'Z',true));//[R, U, Z]
    }
}
