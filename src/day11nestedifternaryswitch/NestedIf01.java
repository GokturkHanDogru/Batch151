package day11nestedifternaryswitch;
import java.util.Scanner;
public class NestedIf01 {
    public static void main(String[] args) {
        /*
Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
Eger calisan kadinsa 60 yasindan buyukse "Emekli Olabilir "yazdirin
Eger calisan erkek ise 65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter  Your Age");
        int age = input.nextInt();

        System.out.println("What is Your Gender");
        String gender = input.nextLine();

        if (gender.equalsIgnoreCase("male")){
            if(age>65){
                System.out.println("Can be retired");
            }else{
                System.out.println("Should work");
            }

        } else if (gender.equalsIgnoreCase("female")) {
            if(age>60){
                System.out.println("Can be retired");
            }else{
                System.out.println("Should work");
            }

        }else {
            System.out.println("Undefined gender");
        }
    }

}
