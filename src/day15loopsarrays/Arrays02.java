package day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        // kücükten büyüge sirala

        int grade [] = {67,98,55,100,98};
        System.out.println(Arrays.toString(grade));

        Arrays.sort(grade);
        System.out.println(Arrays.toString(grade));

        System.out.println(grade[0]+grade[grade.length-1]);

        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleri console'a yazdiriniz

        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for (int i = 0; i<5 ; i++) {
            if (stdNames[i].length() < 5) {
                System.out.println(stdNames[i]);
            }
        }
        // 2. Way
        for (String w:stdNames){
            if (w.length()<5){
                System.out.println(w);
            }
        }
        System.out.println("*************");
        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
//           isimlerden onceki isimleri console'a yazdiriniz

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));

        for (String w: stdNames){
            if (w.startsWith("F")){
                break;
            }else {
                System.out.println(w);
            }
        }
        System.out.println("*************");
        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
//           isilerden onceki isimleri ve F ile baslayanalri    console'a yazdiriniz

        Arrays.sort(stdNames);
        System.out.println(Arrays.toString(stdNames));

        for (String w: stdNames){
            System.out.println(w);
            if (w.startsWith("F")){
                break;
            }
        }
        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
//           isimler haric diger isimleri    console'a yazdiriniz
        Arrays.sort(stdNames);
        for (String w: stdNames){
            if (w.startsWith("F")){
                continue;
            }else {
                System.out.println(w);
            }
        }


    }
}
