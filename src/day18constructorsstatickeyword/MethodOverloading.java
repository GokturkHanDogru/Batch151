package day18constructorsstatickeyword;

public class MethodOverloading {

    /*
    1) Bir method ayni isim ve farkli parametrelerle olusturulursa buna method overloading denir
    2) Meth. over. Java da iyi organizasyon icin önemlidir.
    3)
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
