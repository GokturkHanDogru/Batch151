package StudyGroup;
import java.util.Arrays;
import java.util.Scanner;

//Ex  kullanicidan alacaginiz 5 basamakli bir sayinin ilk 2 ve son 2  rakamlari toplamini
//bulan kodu yaziniz
public class Extra_Digit_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen 5 basamakli bir sayi girin: ");
        String sayi = input.next();

        String array[] = sayi.split("");

        int toplam = 0;
        for (String w : array) {
            if (w != array[2]) {
                int sayiDegeri = Integer.valueOf(w);
                toplam += sayiDegeri;
            }
        }
        System.out.println(toplam);


    }
}
