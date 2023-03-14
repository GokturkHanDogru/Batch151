package StudyGroup;

import java.util.Scanner;

public class Credit_Karte {
    public static void main(String[] args) {
        String name = "Gokturk";
        String cardId = "1234567891234567";


        String  ilkharf=name.substring(0,1);
        name=name.substring(0).replaceAll("[a-zA-Z]","*");
        System.out.print(ilkharf.concat(name)+" ");

      /*  for (int i =0;i<cardId.length();i++){

                if (i < cardId.length() - 4) {
                    System.out.print("*");

                } else {
                    String lastFour = cardId.substring(cardId.length() - 4);
                    System.out.print(lastFour);
                    break;
                }

            }*/
        System.out.println(" ");
        System.out.println("------------------------------");

        String cardId1= cardId.substring(0,4).replaceAll("[0-9]","*");
        String cardId2= cardId.substring(4,8).replaceAll("[0-9]","*");
        String cardId3= cardId.substring(8,12).replaceAll("[0-9]","*");
        String lastFour = cardId.substring(cardId.length() - 4);
        System.out.println(cardId1+" "+cardId2+" "+cardId3+" "+lastFour);
        }
    }

