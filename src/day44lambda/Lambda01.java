package day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //Example 1: Verilen text file icindeki text'i console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("C:\\Users\\goktu\\IdeaProjects\\Batch151\\src\\day44lambda\\TextFile")).forEach(System.out::println);
        //Example 2 : Verilen text file icindeki text'i buyuk harflerle console' a yazdiran code u yaziniz

        Files.lines(Paths.get("C:\\Users\\goktu\\IdeaProjects\\Batch151\\src\\day44lambda\\TextFile")).
                map(String::toUpperCase).
                forEach(System.out::println);

        //Example 3 : Verilen text file icindeki text'i "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz

        boolean r1 = Files.lines(Paths.get("C:\\Users\\goktu\\IdeaProjects\\Batch151\\src\\day44lambda\\TextFile")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

        //Example 4 : Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("C:\\Users\\goktu\\IdeaProjects\\Batch151\\src\\day44lambda\\TextFile")).
                map(t->t.replaceAll("\\p{Punct}","").
                        split(" ")).
                flatMap(Arrays::stream).    //flatMap() methodu arrayleri istenen sekle cevirir. Biz burada stream'e cevirdik
                distinct().
                collect(Collectors.toList());
        System.out.println(words);

        //Example 5: Verilen text file içindeki text'te toplam kaç har kullanıldığını gösteren kodu yazınız.
        long num = Files.
                lines(Paths.get("C:\\Users\\goktu\\IdeaProjects\\Batch151\\src\\day44lambda\\TextFile")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t-> t.split("")).
                flatMap(Arrays::stream).
                count();

        System.out.println(num);

        //Example 5: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
//           icinde return eden kodu yaziniz.

        List<String> letters = Files.
                lines(Paths.get("C:\\Users\\goktu\\IdeaProjects\\Batch151\\src\\day44lambda\\TextFile")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t-> t.split("")).
                flatMap(Arrays::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(letters);
    }

}