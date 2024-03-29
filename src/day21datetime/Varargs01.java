package day21datetime;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add(5,2,4,3));//14

        getInitials("Ali Can","Göktürk Han");

    }
    /*
    //Example 1: Toplama islemi yapan bir method olustur
    //Asagidaki gibi farkli method'lar oluturarak is yapamayiz.
    //Cunku kullanici farkli saidaki sayilari toplamak isteyebilir, her ihtimal icin bir method olusturmak mumkun degildir.
//    public int add(int a, int b){
//        return a+b;
//    }
//
//    public int add(int a, int b, int c){
//        return a+b+c;
//    }
//
//    public int add(int a, int b, int c, int d){
//        return a+b+c+d;
//    }

    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya "Varargs" denir.
    //"Varargs" arkada "Array" yapisini kullanir

    /*
        1)Bir method parantezinde bir'den fazla "Varargs" kullanilamaz.
        2)Bir method parantezi'nde bir'den fazla parametre kullanilacaksa "Varargs" en sonda olmalidir.
     */


    //Write Method of Sum

   /* public int add(int a, int b){

    return a+b;
    }*/
    public  static int add (int... a){
        int sum = 0;

        for (int w:a){
            sum+=w;
        }

        return sum;
    }

    public static void getInitials ( String... s){

        String initials = "";
        for (String w : s){
            initials = initials + w.charAt(0)+w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials ="";
        }
    }
}
