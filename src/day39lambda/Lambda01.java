package day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartWithT(myList);
        System.out.println();
        printElLessThanFour(myList);
        System.out.println();
        printElMoreThanFour(myList);
        System.out.println();
        printElLengthMoreThanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueUpperCaseSorted(myList);
        System.out.println();
        printElUniqueLowerCaseSortWithLength(myList);
    }

    //Ex 1: Bir Listteki elemanlari console'a yazdiran method'u olusturunuz.
    // 1.Way
    public static void printElements(List<String> myList){
        for (String w :myList) {
            System.out.print(w+" ");
            
        }

    }
    //2.Way
    public static void printEl(List<String> myList){
        myList.stream().forEach(t-> System.out.print(t+" "));
    }


    //Ex 2: Bir Listteki T ile baslayanlar haric tüm elemanlari console'a yazdiran method'u olusturunuz.

    public static void printElExceptStartWithT(List<String> myList){
        myList.stream().filter(t->!t.startsWith("T")).forEach(t-> System.out.print(t+" "));
    }


    //Ex 3: Bir List'te  karakter sayisi 4'ten az olan tüm elemanlari console'a yazdiran method'u olusturunuz.

    public static void printElLessThanFour(List<String> myList){
        myList.stream().filter(t-> t.length()<4).forEach(t-> System.out.print(t+" "));
    }


    //Ex 4: Bir List'te  karakter sayisi 4'ten cok olan tüm elemanlari büyük harflerle console'a yazdiran method'u olusturunuz.

    public static void printElMoreThanFour(List<String> myList){
        myList.stream().filter(t-> t.length()>4).map(t-> t.toUpperCase()).forEach(t-> System.out.print(t+" "));
    }


    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElLengthMoreThanFourUniqueLowerCase(List<String> myList){
        myList.
                stream().
                distinct().
                filter(t-> t.length()>4).
                map(t-> t.toLowerCase()).
                forEach(t-> System.out.print(t+" "));
    }


    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void printElUniqueUpperCaseSorted(List<String> myList){
        myList.stream().
                distinct().
                map(t-> t.toUpperCase()).
                sorted().
                forEach(t-> System.out.print(t+" "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static void printElUniqueLowerCaseSortWithLength(List<String> myList){
        myList.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t-> t.length())).
                forEach(t-> System.out.print(t+" "));
    }


}
