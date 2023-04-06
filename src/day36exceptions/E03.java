package day36exceptions;

public class E03 {
    /*
    throws ile throw arasindaki farkalr nelerdir?

    1) throws method signature satirinda kullanilir. throw ise method'un body'sinda kullanilir.
    2) throws method signature satirinda bir veya  birden fayla Exception ile bir kere kullanilir.
        throw ise method body icinde bir tane Exception ile tekrar tekrar kullanilabilir.
    3)throws dan sonra sadece Exception class isimleri yazilir.
       throw dan sonra Exception class'dan object olusturulur.
     */
    public static void main(String[] args) {
        //Example 1 : Kullanicidan alinan yasi console'a yazdiran methodu olusturunuz
        printAge(23);


        try {
            printAge(-13);
        }catch (IllegalArgumentException e){
            System.out.println("Negative ages are not valid");
        }

        printAge(-9);

    }
    public static void printAge (int age){

        if (age<0){
            throw new IllegalArgumentException("Used negative integers for ages");
        }
        System.out.println(age);
    }
}
