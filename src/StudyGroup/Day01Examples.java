package StudyGroup;

import java.util.Scanner;

public class Day01Examples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*int i = 126;
        if(i%10>=5){
            System.out.println("Son basamagi bi üste yuvarla "+(i/10+1)*10);
        }else{
            System.out.println("Son basamagi bi alta yuvarla"+(i/10)*10);
        }*/

        double mil = 10;
        double saniye = 7200;
        double fahrenayt= 83;
        System.out.println("Dünüsüm Cinsini Giriniz:");
        String operator = input.nextLine();

        if(operator.equals("mildenKmye")){
            System.out.println(mil*1.60934);
        }else if(operator.equals("saniyedenSaate ")){
            System.out.println((saniye /60)/60);
        }else if(operator.equals("fahrenaytdanSantigarata ")){
            System.out.println((fahrenayt -32)*5/9);
        }
    }
}
