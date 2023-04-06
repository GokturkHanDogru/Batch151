package practices.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class C02_StringBuilderBufferCompetence {
    /*
2023 Nisan QA Tester
 * For loop ile 1000 defa bir islem yapalim. Oncesinde ve sonrasinda zamani
 * kontrol edip C01_StringBuilder ,String Buffer ve String class'larinin performanslarini
 * karsilastiralim.
 * Ipucu: long TimeSb = System.nanoTime(); kullanalim
 */
    public static void main(String[] args) {

        String str = "Merhaba";
        System.out.println("*************************String************************");

        Long t1 = System.nanoTime();
        for (int i=0;i<1000; i++){
            str+=" ";
        }
        Long t2 = System.nanoTime();

        System.out.println("String Run Time:"+ ((t2-t1)/1000)); //4152

        System.out.println("*************************StringBuffer************************");

        StringBuffer buffer = new StringBuffer("Merhaba");

        Long t3 = System.nanoTime();
        for (int i=0;i<1000; i++){
            buffer =buffer.append(" ");
        }
        Long t4 = System.nanoTime();

        System.out.println("Buffer Run Time:"+ ((t4-t3)/1000)); //113

        System.out.println("*************************StringBuilder************************");

        StringBuilder builder = new StringBuilder("Merhaba");

        Long t5 = System.nanoTime();
        for (int i=0;i<1000; i++){
            builder =builder.append(" ");
        }
        Long t6 = System.nanoTime();
        System.out.println("Builder Run Time:"+ ((t6-t5 )/1000)); //113

        Long strTime = (t2-t1);
        Long bufTime = (t4-t3);
        Long buiTime = (t5-t6);
        Long kiyas [] = {strTime,buiTime,buiTime};
        Arrays.sort(kiyas);


        if(kiyas[0]== strTime){
            System.out.println("En hizli String");
        } else if (kiyas[0]==bufTime) {
            System.out.println("En hizli Buffer");
        }else {
            System.out.println("En hizli Builder");
        }
        if (kiyas[2]==strTime){
            System.out.println("En yavas String");
        }
        else if (kiyas[2]==bufTime){
            System.out.println("En yavas Buffer");
        }else {
            System.out.println("En yavas Builder");
        }
    }
}
