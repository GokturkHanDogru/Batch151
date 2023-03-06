package day12switchcrementdecrementloops;

public class Switch01 {
    public static void main(String[] args) {
        int monthNumber = 5;
        switch (monthNumber){

            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;//and go's on!

            default:
                System.out.println("Wrong Number Typed! Try Again");
        }
    }
}
