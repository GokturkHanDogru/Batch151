package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        //Example 1: Type code to print the number of occurrences of words in a sentence
        //"I like you, like like!"  =>


        String s ="I like you you, like like!";
        System.out.println(s);

        // like ile like! ayni yapabilmek icin tüm noktalama isaretlerini silelim
        s= s.replaceAll("\\p{Punct}","");
        System.out.println(s);

        String words [] = s.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String,Integer> occ = new HashMap<>();
        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
        //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for (String w : words){

            Integer numOfOccurence = occ.get(w);

            if (numOfOccurence==null){
                occ.put(w,1);
            }
            else{
                occ.replace(w,numOfOccurence+1);
            }
        }
        System.out.println(occ);//{like=3, I=1, you=2}


    }
}
