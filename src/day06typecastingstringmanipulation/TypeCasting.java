package day06typecastingstringmanipulation;

public class TypeCasting {
    public static void main(String[] args) {

        // ********************  ExplicitNarrowing ***********************\\\\\\\\\\\\\\\\\\\\\
            /*
            Explicit Narrowing yaparken dikkat edilmeli .
            Cunku Cok Ciddi Data kaybi hatta Datanin degismesine neden olabilir.
            Eger sayimiz donusturmeye calistigimiz variable'in sinirlari
            disinda ise; Java sayiyi mod islemine alir ve kalani yazdirir.
            Kalan bolenin yarisindan fazlaysa kalan sayiyi Java kucultmek ister ve
            bolumu 1 buyuterek kalani (-)isaretli olacak sekilde yazdirir


            */

        // short dat type'inde bir variable olusturup byte data type'ina ceviren kodu yaziniz
        short num =260;
        byte numByte= (byte) num;
        System.out.println("numByte = " + numByte);//4

        short num2=1023;
        byte num2Byte= (byte) num2;
        System.out.println("num2Byte = " + num2Byte);//-1

        short num3=1000;
        byte num3Byte= (byte) num3;
        System.out.println("num3Byte = " + num3Byte);// -24

        int intSayi =8880;
        short shortSayi= (short) intSayi;//32768 + 32768 + 0
        System.out.println("shortSayi = " + shortSayi);//8880

    }//main
/*
1)toUpperCase():
            i)Bir String'deki tum harfleri
            buyuk harfe cevirmek icin kullanilir.
            ii) toUpperCase() method'u "String" return eder
2)toLowerCase():
            i)Bir String'deki tum harfleri kucuk
            harfe cevirmek icin kullanilir.
            ii) toLowerCase() method'u "String"
            return eder
3)charAt(): i) Bir String'den belli bir index'deki
            characteri almak icin kullanilir.
            ii)charAt() method'u "char" return eder.
4) lenght():i) bir datadaki karakter sayisini bize verir
            ii) int bir deger dondurur
5)substring(): iki kullanimi vardir
            i) substring(baslangicIndexi,bitisIndex) 'i verilirse
               baslangic indexi dahil bitis indexi haric yazdirir
               Metnin ortasindan data almamizi saglar
            ii)(baslangicIndexi) String'in verilen indexten sonuna
               kadar alinmasini saglar
               Bu method bize String dondurur.
6) contains()  :
            i) Bir String'de belli bir characterin veya characterlerin var
               olup olmadigini anlamak icin kullanilir
            ii)contains() method'u "boolean" return eder.
7)substring()  in iki kullanimi vardir.
            i) substring(baslangic indexi, bitis indexi) String'in ortasindan
               bir parca almaya yarar
            ii)substring(baslangic indexi) String'in verilen index'ten sonuna
               kadar almaya yarar.
               Sonuc ise String dir.
8) startsWith() Metnin bas kisminin istenilen dizi(1 veya
                daha fazla karakter) ile eslesip eslesmedigini
                kontrol eder.Sonucu boolean dir

 */
}
