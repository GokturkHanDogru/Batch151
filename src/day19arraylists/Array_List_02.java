package day19arraylists;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class Array_List_02 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Miami");
        cities.add("Kirikkale");
        cities.add("Artvin");
        cities.add("Schaffhausen");
        cities.add("Kirikkale");
        cities.add("Artvin");
        cities.add("Miami");
        cities.add("Schaffhausen");


        System.out.println(cities);

        //deleting of First appereance
        cities.remove("Artvin");
        System.out.println(cities);

        // Deleting with index number
        cities.remove(1);
        System.out.println(cities);

        // Arraylist or List

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        //Delete value 12
        ages.add((Integer)12);
        System.out.println(ages);

        // How can be deleted all of appereance of Elements
        List<String> citiesToRemove = new ArrayList<>();
        citiesToRemove.add("Schaffhausen");
        citiesToRemove.add("Miami");

        cities.removeAll(citiesToRemove);
        System.out.println(cities);//[Kirikkale, Artvin]

        // that's shorcut of creating a list
        List<Character> initials = List.of('a','k','c','d','k');
        System.out.println(initials);//[a, k, c, d]

        List<Character> letters = List.of('a','c','k','d','k');
        System.out.println(letters);

        //Are two arrays equal or not
        boolean r1 = initials.equals(letters);
        System.out.println(r1);//false

        // Finding Index
        System.out.println(initials.indexOf('k'));//1
        System.out.println(initials.lastIndexOf('k'));//4

        //Ex:1 Write a code that shows in a Array non-duplicate elemenets

        List<Double> price = List.of(2.5,5.0,6.75,2.5,1.25,4.0);

        for (Double w :price){
            if (price.indexOf(w)== price.lastIndexOf(w)){
                System.out.print(w+"  "); //5.0  6.75  1.25  4.0
            }
        }

        // Ex:2
        int counter = 0;
        List<Double> heights = List.of(2.5,5.0,6.75,2.5,1.25,4.0);
        for (Double w :heights){

            if (heights.indexOf(w) == heights.lastIndexOf(w)){
                counter++;
            }

        }
        if (counter == 0){
            System.out.println(" All elements are unique  in the List");
        } else {
            System.out.println(" At least one element is not unique in the List");
        }




    }
}
