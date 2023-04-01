package day31collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*

MY NOTES:
Map'lerde sozluklerdeki gibi kelime ve manasi seklinde bir kullanim vardir.
"key" kismi tekrarsiz, "value kismi birden fazla olabilir.
Mapler "key" ve "value" structur'ini kullanir.
Map'lerdeki elemanlara "entry" denir.
Elemanlarin tamanina ise "entry set" denilir.
Tekrarsiz kullanim oldugu icin "Entry Set"denilir.
Key ve Value'lar ayri ayri data type'larinda olabilirler.
Map'ler Collection degildir, farkli bir yapidir.

HashMap'ler Entry'leri rastgele siralar bu yüzden hizli Map'tir.

*/
public class HashMap01 {
    public static void main(String[] args) {

    //Map nasil olusturulur.
    HashMap<String,Integer> countryPopulation = new HashMap<>();

    //Nasil ekleme yapar.
    countryPopulation.put("Germany", 830000000);
    countryPopulation.put("Albania", 30000000);
    countryPopulation.put("USA", 40000000);
    countryPopulation.put("Turkey", 830000000);
    countryPopulation.put("Netherlands", 6000000);

        System.out.println(countryPopulation);//{USA=40000000, Netherlands=6000000, Turkey=830000000, Germany=830000000, Albania=30000000}

        // get() methodu "key" ile calisir ve "value" kismini verir
        System.out.println(countryPopulation.get("USA"));//40000000


        //Bütün Key'leri alma methodu
        Set<String> keys = countryPopulation.keySet();//[USA, Netherlands, Turkey, Germany, Albania]
        System.out.println(keys);

        //Bütün Value'lari alma methodu
        Collection<Integer> values = countryPopulation.values();
        System.out.println(values);//[40000000, 6000000, 830000000, 830000000, 30000000]

        // example 1 countrypoplation map indeki ulkelerin nufuslarinin ortalamasi kactir
        Collection<Integer> value = countryPopulation.values();

        int sum =0;
        for (Integer w: value){
            sum+=w;
        }
        System.out.println(sum/ value.size());//347200000


        ////entrySet() "entry"leri kalip halinde alip bize "Set"in icine koyarak verir
        Set<Map.Entry<String,Integer>> entries =  countryPopulation.entrySet();
        System.out.println(entries);


        //Ex:2 countrypopulation map'indeki ülkelerin isimlerinin karakter sayisi ile nüfüslarinin toplamini bulunuz.

        int toplam=0;

        for (Map.Entry<String,Integer> w : entries){
           toplam= toplam+w.getKey().length()+w.getValue();
        }
        System.out.println(toplam);//1736000034
    }
}
