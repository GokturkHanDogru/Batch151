package practices.day17lambda;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

        public static void main(String[] args) {

            List<Integer> nums = new ArrayList<>();
            nums.add(12);
            nums.add(9);
            nums.add(131);
            nums.add(14);
            nums.add(9);
            nums.add(10);
            nums.add(4);
            nums.add(12);
            nums.add(15);

            elemanlariYazdir1(nums);//1
            System.out.println();
            elemanlariYazdir2(nums);//2
            System.out.println();
            ciftElemanlar1(nums);//3
            System.out.println();
            ciftElemanlar2(nums);//4
            System.out.println();
            tekElemanlarinKaresi1(nums);//5
            System.out.println();
            tekElemanlarinKüpüTekrarsiz(nums);//6
            System.out.println();
            System.out.println(benzersizCiftElKareleriToplami(nums));//7
            System.out.println(benzersizCiftElKareleriCarpimi(nums));//8
            maxDeger1(nums);//9
            maxDeger2(nums);//9
            System.out.println(maxDeger3(nums));//9
            minDeger(nums);//10
            System.out.println(minDeger2(nums));


        }

        //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
        public static void elemanlariYazdir1(List<Integer> nums){
            for (Integer w:nums) {
                System.out.print(w+" ");
            }
        }



        //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
        public static void elemanlariYazdir2(List<Integer> nums){
            nums.stream().forEach(t-> System.out.print(t+" "));
        }



        //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
        public static void ciftElemanlar1 (List<Integer> nums){

            for (Integer w : nums){
                if (w % 2 == 0){
                    System.out.print(w + " ");
                }
            }
        }

        //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
        public static void ciftElemanlar2(List<Integer> nums){
            nums.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t+" "));
        }

        //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
        public static void tekElemanlarinKaresi1 (List<Integer> nums){

           nums.stream().filter(t-> t%2==1).map(t-> t*t).forEach(t-> System.out.print(t+" "));
        }

        //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
        public static void tekElemanlarinKüpüTekrarsiz (List<Integer> nums){
            nums.stream().filter(t-> t%2 != 0).distinct().map(t-> t*t*t ).forEach(t-> System.out.print(t+" "));

        }

        //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
        public static int benzersizCiftElKareleriToplami(List<Integer> nums){
        return nums.stream().filter(t-> t%2==0).distinct().map(t->t*t).reduce(Math::addExact).get();


        }


        //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

        public static int benzersizCiftElKareleriCarpimi (List<Integer> nums){
            return nums.stream().distinct().filter(t-> t%2==0).map(t-> t*t).reduce(Math::multiplyExact).get();
        }


        //9)Liste ogelerinden max degeri veren bir method olusturunuz
        //1.Yol
        public static void maxDeger1 (List<Integer> nums){
            int max = nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u);
            System.out.println(max);
        }
        //2.Yol
         public static void maxDeger2 (List<Integer> nums){
             int max = nums.stream().distinct().sorted().reduce((t,u)->u).get();
             System.out.println(max);
        }
        //3.Yol
            public static int maxDeger3 (List<Integer> nums){
            return nums.stream().max(Integer::compareTo).get();
        }



        //10)Liste ogelerinden minumum degeri veren method olusturunuz
        //1.Yol
        public static void minDeger(List<Integer>nums){
            Integer min =nums.stream().distinct().reduce(Integer.MAX_VALUE,(t,u)->t<u ? t:u);
            System.out.println("min = " + min);
        }
        //2.Yol
        public static int minDeger2 (List<Integer>nums){
            return nums.stream().distinct().reduce((t,u)-> t<u ? t : u).get();
        }

    }

