package StudyGroup;

import java.util.Scanner;

public class Credit_Karte {
    public static void main(String[] args) {
        String name = "Gokturk";
        String cardId = "1234 5678 9123 4567";

       /* for (int i =0; i<name.length();i++){
            if (name.charAt(i) == ' '){
                continue;
           */

        String  ilkharf=name.substring(0,1);
        name=name.substring(0).replaceAll("[a-zA-Z]","*");
        System.out.print(ilkharf.concat(name)+" ");

        for (int i =0;i<cardId.length();i++){
            if (cardId.charAt(i) == ' ') {
                continue;
            }
                if (i < cardId.length() - 4) {
                    System.out.print("*");

                } else {
                    String lastFour = cardId.substring(cardId.length() - 4);
                    System.out.print(lastFour);
                    break;
                }

            }
        }
    }

