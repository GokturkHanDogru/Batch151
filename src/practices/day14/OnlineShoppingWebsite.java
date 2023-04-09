package practices.day14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineShoppingWebsite {

    static Scanner input = new Scanner(System.in);
    static List<String> urunlistesi = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();

    static double toplamOdeme ;

    public static void main(String[] args) {

        urunlistesi.add("Saat Ürün Kodu 0");
        urunlistesi.add("Monitor Ürün Kodu 1");
        urunlistesi.add("Canta Ürün Kodu 2");
        urunlistesi.add("Tv Ürün Kodu 3");
        urunlistesi.add("Kitap Ürün Kodu 4");


        urunFiyatlari.add(150.0);
        urunFiyatlari.add(3000.0);
        urunFiyatlari.add(5000.0);
        urunFiyatlari.add(6000.0);
        urunFiyatlari.add(100.0);


        List<String> yeniUrunler = new ArrayList<>();
        yeniUrunler.add("Taki Ürün Kodu 5");
        yeniUrunler.add("Tencere Ürün Kodu 6");
        yeniUrunler.add("Kiyafet Ürün Kodu 7");
        urunlistesi.addAll(yeniUrunler);


        List<Double> yeniUrunFiyatlari = new ArrayList<>();
        yeniUrunFiyatlari.add(900.0);
        yeniUrunFiyatlari.add(200.0);
        yeniUrunFiyatlari.add(400.0);
        urunFiyatlari.addAll(yeniUrunFiyatlari);

        musteriSecim();
    }

    public static void musteriSecim(){
        urunlistesiniGöster();

        System.out.println("Lütfen ürün kodunu giriniz:");
        int urunKodu = input.nextInt();

        if (urunKodu >= 0 && urunKodu <= urunlistesi.size()){
            System.out.println("Kac adet istiyorsnuz");
            int adet = input.nextInt();
            double toplamUrunFiyati =  urunFiyatlari.get(urunKodu)*adet;
            toplamOdeme+=toplamUrunFiyati;
            devamMi();
        }else {
            System.out.println("Lütfen gecerli bir ürün kodu giriniz");
            musteriSecim();
        }
    }

    private static void devamMi() {
        System.out.println("Alisverise devam etmek icin ==>1'e \n cikmak icin ==>2'ye basiniz");
        int devamMi = input.nextInt();
        if (devamMi==1){
            musteriSecim();
        }else if( devamMi==2){
            odemeYap();
        }else {
            System.out.println("Lütfen gecerli bir secenek giriniz");
            devamMi();
        }
    }

    private static void odemeYap() {

        LocalDate kurulusGunu = LocalDate.of(2022,4,9);
        LocalDate odemeGunu = LocalDate.now();
        if (odemeGunu.equals(kurulusGunu)){
            slowPrint("TechPro Alisveris Sitesine hos geldiniz \n Bugün Kurulus günümüz borcunuz yok :)",40);
        }else{
            slowPrint("TechPro Alisveris Sitesine hos geldiniz",40);
            System.out.println(toplamOdeme+"TL");
        }
    }

    private static void slowPrint(String s, int i) {
        for (char ch : s.toCharArray()) {
            System.out.print(ch);
            try {
                Thread.sleep(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private static void urunlistesiniGöster() {
        System.out.println("*********Ürün Listesi***********");
        for (int i = 0; i < urunlistesi.size(); i++) {
            System.out.println(i+" - "+urunlistesi.get(i)+" Fiyat "+urunFiyatlari.get(i)+" TL ");
        }

    }
}
