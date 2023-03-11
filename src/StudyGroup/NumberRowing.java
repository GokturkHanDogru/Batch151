package StudyGroup;

public class NumberRowing {
    public static void main(String[] args) {
        int  arr [] ={10, 20, 20, 10, 10, 20, 5, 20} ;

            for (int i =0 ;i< arr.length;i++){
                int count =0 ;
                for (int w:arr){
                     if (arr[i]==w){
                     count++;
                 }

            }
              System.out.println(arr[i]+" sayisi," + count+" tekrar etmistir");
        }

    }
}
/*
String s = "Apex is an object oriented programming language";
        String harfler[]=s.replaceAll("[^aeiuoAEIUO]","").split("");
        System.out.println("Toplam sesli harf sayisi"+harfler.length);
 */