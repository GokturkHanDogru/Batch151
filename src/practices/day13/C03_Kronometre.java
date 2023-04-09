package practices.day13;

import java.util.Scanner;

public class C03_Kronometre {

    // QA 2023 Interview Questions

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Kac kez islem yapilaccagini giriniz.");
        int numTasks = input.nextInt();

        Long t1 = System.currentTimeMillis();
        System.out.println("***************");

        for (int i = 0; i < numTasks; i++) {
            int number [] = {1,2,3,4,5};
            int sum = 0;
            for (int w : number) {
                sum+=w;
            }
            System.out.println("toplam: "+ sum);
            System.out.println(i+1+". Islem tamamlandi");
            System.out.println("*************************");
            
        }
        long t2 = System.currentTimeMillis();
        long runTime = (t2-t1);

        System.out.println("Run Time: " + runTime);
        System.out.println("Ortalama süre: "+ ((double)runTime/numTasks));


    }
}
