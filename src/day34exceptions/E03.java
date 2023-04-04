package day34exceptions;

public class E03 {
    public static void main(String[] args) {
        System.out.println(getNumOfChar("Java"));
        System.out.println(getNumOfChar("Money"));
        System.out.println(getNumOfChar(""));

        System.out.println(getNumOfChar(null));

    }

    // Bir string'deki karakter sayisini veren method olusturunuz
    public static int getNumOfChar(String s){
        int result = 0;
        try {
          result =  s.length();

        }catch (NullPointerException e){
            return 0;

        }
        return result;
    }
}
