package practices.day13;

public class C01_Russuleti {
    /*

================== RUSSULETI ======================
Birbirleriyle çarpılacak sayılar yan yana yazılır.
ilk sayı ikiye bölünür ve sonuç hemen altına yazılır.
sonuç küsuratlı(kesirli) çıktıysa kesir kısmıyla ilgilenilmez
sadece tam sayı kısmı yazılır. diğer sayı ise ikiyle çarpılır
ve sonuç hemen altına yazılır.
bu işlem yeni sayılar için tekrarlanır,
ta ki ilk sayı ikiye bölüne,
bölüne 1(bir) değerine ulaşana kadar.
birinci sütundaki çift sayıların
ikinci sütundaki karşılıkları silinir.
ikinci sütunda silinmeyen sayılar
toplandığında elde edilen sonuç
istenilen sayıdır.
    örnek:
456 x 219 = ? 99864

456........219
228........438
114........876
57 ........1752
28 ........3504
14 ........7008
7  ........14016
3  ........28032
1  ........56064
     */


    public static void main(String[] args) {

        int ilksayi = -455;
        int ikincisayi = 219;

        System.out.println(carpim(ilksayi, ikincisayi));

    }

    public static int carpim(int ilksayi, int ikincisayi) {
        boolean negatif = false;
        if (ilksayi<0){
            ilksayi = -ilksayi;
            negatif =! negatif;
        }
        if (ikincisayi<0){
            ikincisayi = -ikincisayi;
            negatif =! negatif;
        }
        int toplam =0;

        do {
            if (ilksayi % 2 == 1) {
                toplam += ikincisayi;
            }
            ilksayi = ilksayi / 2;
            ikincisayi = ikincisayi * 2;


        }while(ilksayi>=1);

        if (negatif)
            toplam = -toplam;
        return toplam;
    }
}
