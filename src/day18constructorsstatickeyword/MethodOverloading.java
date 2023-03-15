package day18constructorsstatickeyword;

public class MethodOverloading {

    /*
    1) Bir method ayni isim ve farkli parametrelerle olusturulursa buna method overloading denir
    2) Meth. over. Java da iyi organizasyon icin önemlidir.
    3)Method Overloading yaparken parametre 3 sekilde degistirilebilir;
            i)Parametrelerin sayilari degistirilebilir.
            ii)Parametrelerin data type'larini degistirebilirsiniz.
            iii)Parametrelerin data type'lari farkli ise yerleri degistirilebilir.
        4)"Method Overloading" bir class'in icinde olusur bu yuzden "private" method'lar da overload edilebilir.
          "Method Overloading" butun access modifier'larda kullanilabilir.
        5)"static" method'lar "overload" edilebilirler.
     */
    public static void main(String[] args) {

    }
    public static int add ( int a, int b){
            return a+b;
        }
    public static int add ( int a, int b, int c){
        return a+b+c;
    }
    public static double add ( double a, int b){
        return a+b;
    }
    public static double add ( int a, double b) {
        return a + b;
    }

}
