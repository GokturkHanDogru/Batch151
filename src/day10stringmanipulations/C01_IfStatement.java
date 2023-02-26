package day10stringmanipulations;

public class C01_IfStatement {
    public static void main(String[] args) {

        char ch = 'A';

        if (ch>'A'&&ch<'Z'){
            System.out.println("Big Letter");
        }

        int num = 4;
        if (num%2 ==0 ){
            System.out.println(" Cift sayidir");
        }else {
            System.out.println("Cift Sayi degildir");
        }
    }
}
