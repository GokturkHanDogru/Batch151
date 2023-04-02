package replit;

import java.util.ArrayList;
import java.util.List;

public class List_04 {
    /*
    Write a program that deletes the letters 'a' from the names in the list given as input.


         INPUT :
         list1={"Ali","Veli","Ayse","Fatma","Omer"}

         OUTPUT :

         [Veli,Omer]

     */
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Veli");
        names.add("Ayse");
        names.add("Fatma");
        names.add("Omer");

        String [] namesArr = new String[names.size()];
        namesArr = names.toArray(namesArr);


        for (String w : namesArr) {

            if(w.contains("a") || w.contains("A")){
                names.remove(w);
            }else {
                System.out.println(names);
            }

        }

    }
}
