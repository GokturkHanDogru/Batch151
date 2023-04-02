package day33maps;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMap01 {
    public static void main(String[] args) {

        System.out.println(getNumOfOccurrenceOfLetters("Hello Henry!"));

    }

    //Example 1: Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
//           "Hello Henry!"==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

    public static TreeMap<String,Integer> getNumOfOccurrenceOfLetters(String s) {

        //String'teki harf disi harakterleri siler
        s = s.replaceAll("[^A-Za-z]", "");

        //Görünüm sayilarini depolamak icin Map olusur
        TreeMap<String, Integer> numOfOccurence = new TreeMap<>();

        //Harfleri al
        String letters[] = s.split("");

        for (String w : letters) {
            Integer numOfOcc = numOfOccurence.get(w);

            if (numOfOcc == null) {
                numOfOccurence.put(w, 1);
            } else {
                numOfOccurence.replace(w, numOfOcc +1);
            }

        }
        return numOfOccurence;
    }
}
