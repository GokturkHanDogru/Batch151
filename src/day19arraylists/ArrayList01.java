package day19arraylists;
/*
        1)Ayni data type'indeki coklu data'lari depolamak icin Array kullaniriz.
        2)Array'lerin bir negatif yonu var; icine koyacaginiz eleman sayisini en basta belirlemek zorundasiniz.
        3)Array'ler eleman sayisinda esnek degildirler, bu yuzden Java "ArrayList" adli yeni bir yapi olusturdu,
          bu yapi eleman sayisinda esnekdir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar, 1000
          eleman koyarsaniz eleman sayisini 1000 olarak ayarlar.
        4)"ArrayList" yerine sadece "List" de diyebiliriz.
        5)Java "ArrayList"leri olusturduktan sonra Array'leri iptal etmedi cunku;
            i)Array'ler super hizlidir.
            ii)Array'ler memory'de coook az yer kaplar.
        6)Array'ler "primitive data" type'lari ve "reference"lari depolayabilir ama "ArrayList" ler "non-primitive" data type'larini
          depolar bu yuzden "ArrayList" ler Array'lerden daha cok yer kaplar.
     */
import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(ages);

        //1.Way
        ages.add(12);
        ages.add(24);
        ages.add(9);
        System.out.println(ages); // 12,24,9

        //2.Way
        ages.add(1,99);
        System.out.println(ages); //12,99,24,9

        ArrayList<Integer> price =new ArrayList<>();
        price.add(23);
        price.add(33);

        //3.Way
        ages.addAll(price);
        System.out.println(ages);// 12,99,24,9,23,33


        //4.Way
        ages.addAll(3,price);
        System.out.println(ages);// 12,99,24,23,33,9,23,33

        //Arraylist number of element findig

        int numOfElement = ages.size();
        System.out.println(numOfElement);


        //In Arraylist pull of specific Element '23'

        int el1 = ages.get(3);
        System.out.println(el1); //23

        // How to change a specific value in ArrayList
        ages.set(6,111);
        System.out.println(ages); //12,99,24,23,33,9,111,33

        //Contanis of sth.
        boolean r1 = ages.contains(99);
        System.out.println(r1); //True

        //
        boolean r2 = ages.isEmpty();
        System.out.println(r2);//False

        //Delete all elements of List
       ages.clear();

       //Ex: Write code that list empty or not
        ArrayList<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cüneyt");
        names.add("Angeline");
        names.add("Brad");

        //1.Way
        if (names.size()==0){
            System.out.println("List is empty");
        }else {
            System.out.println("List have at least one element");
        }

        //2.Way Recommended
        if (names.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List have at least one element");
        }
    }
}
