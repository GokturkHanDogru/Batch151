package replit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class List_02 {
    /*
    Create a 10-element list. Swap the 8th element with the 3rd element.


INPUT :
String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Umit");
        names.add("Emin");
        names.add("Kemal");
        names.add("Kerem");
        names.add("Taylan");
        names.add("Orhan");
        names.add("Sinan");
        names.add("Furkan");
        names.add("Ahmet");
        names.add("Ali");

        Collections.swap(names,2,7);

        System.out.println(names);
        



    }
}
