package javaders.day08stringmanipulations;
import java.util.Scanner;
public class C02_StringManipulations {
    public static void main(String[] args) {
        System.out.println("Lutfen mail adresinizi\ni)mail adresi \"gmail\" icermeli\n" +
                "               ii)Space characteri mail'de olmamali\n" +
                "               iii)mail adresinde buyuk harf olmamali\n" +
                "               iv)En az bir tane noktalama isareti bulunmali\nveriniz ");
        System.out.println("Please Write Your Mail Adresse:");
        Scanner input = new Scanner(System.in);
        String mail = input.nextLine();

        boolean first = mail.contains("@gmail");
        System.out.println("first = " + first);

        boolean second = !mail.contains(" ");
        System.out.println("second = " + second);

        boolean third = mail.replaceAll("[a-z0-9]","").replaceAll("[\\p{Punct}]","").length() ==0;
        System.out.println("third = " + third);

        boolean fourth = mail.replaceAll("[a-zA-Z0-9]","").length() >0;
        System.out.println("fourth = " + fourth);

        System.out.println(first&&second&&third&&fourth);
       // boolean fourth2 = mail.replaceAll("[^\\p{Punct}]", "").length() >0;
        // boolean fourth3 = mail.replaceAll("[\\P{P}]", "").length() >0;




    }
}
