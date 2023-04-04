package day34exceptions;

public class E01 {
    /*
    1) Exception beklenmedik problem demektir.
    2) Exception'lari halledebilmek icin 2 temel yol vardir.
        i)Exception'a uygun cözümler üretmek.
        ii)Exception olustugunda bunu ilan eder ve geri cekilirsiniz. Buna da Throw Exception denir.
    3) Exception'a uygun cözümler üretmede try-catch kullanilir.
    "try" blockda yapilmasi gereken islemi javadan yapmasi istenir.
    Java islemi problemsiz bir sekilde yaparsa java tarafindan okunmaz
    Try blockda islem yapilirken Exception olusursa catch blok devereye girer ve catch blok icindeki kodlar calisir
    4) try blockda islem yapilirken Exception olusursa tryblok icerisindeki Exception'den sonraki kodalr calismaz.


     */
    public static void main(String[] args) {
        System.out.println(divide1(12,3));
        System.out.println(divide1(12,0));

        System.out.println(divide2(12,3));
        System.out.println(divide2(12,0));

    }

    //1.Way: Exception'i handle etmede ilk yol
    public static int divide1(int a, int b){

        if (b==0){
            return 0;
        }else {
            return a / b;
        }
    }
    //2.Way Exception'i handle etmek icinen iyi yol
    public static int divide2(int a, int b){

        int sonuc=0;
        try {
            sonuc=a/b;
        }catch (ArithmeticException e){// "ArtihmeticException" matematik ile ilgili herhangi bir kural ihlali yapildiginda atilir.
            System.out.println("Do not any number by Zero");

        }
        return sonuc;
    }
}
