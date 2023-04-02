package day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
/*
    1)TreeMap "thread-safe" ve "synchronized" degildir.
            Note: Map'lerde "multi thread" kullanmaniz gerektiginde sadece HashTable kullanabilirsiniz
            2)TreeMap ler value'larda null kullanimina musaade eder, key'lerde etmez.
            3)TreeMap entry'leri key'lerine gore natural order'a gore siraya koyar. Bu yuzden coook yavastir
            */

    public static void main(String[] args) {
        Long t1 = System.nanoTime();
        TreeMap<String,Integer> countryPopulations = new TreeMap<>();
        countryPopulations.put("USA",400000000);
        countryPopulations.put("Netherlands",18000000);
        countryPopulations.put("Turkey",83000000);
        countryPopulations.put("Belgium",13000000);
        countryPopulations.put("Meksika",125000000);
        countryPopulations.put("Brazil",25000000);
        countryPopulations.put("France",60000000);
        countryPopulations.put("Finland",8000000);
        countryPopulations.put("Germany",85000000);
        countryPopulations.put("Madagaskar",30000000);

        System.out.println(countryPopulations);

        Long t2 = System.nanoTime();

        HashMap<String,Integer> countryPop = new HashMap<>();
        countryPop.put("USA",400000000);
        countryPop.put("Netherlands",18000000);
        countryPop.put("Turkey",83000000);
        countryPop.put("Belgium",13000000);
        countryPop.put("Meksika",125000000);
        countryPop.put("Brazil",25000000);
        countryPop.put("France",60000000);
        countryPop.put("Finland",8000000);
        countryPop.put("Germany",85000000);
        countryPop.put("Madagaskar",30000000);

        TreeMap<String,Integer> countryPop2 =new TreeMap<>(countryPop);
        System.out.println(countryPop2);

        Long t3 = System.nanoTime();

        System.out.println(t2-t1);
        System.out.println(t3-t2);

    }
}
