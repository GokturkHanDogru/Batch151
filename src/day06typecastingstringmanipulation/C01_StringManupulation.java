package day06typecastingstringmanipulation;

import java.util.logging.SocketHandler;

public class C01_StringManupulation {
    public static void main(String[] args) {
        String a = "Hello World !";
        System.out.println(a);

        String aUpper = a.toUpperCase();
        System.out.println(aUpper);

        String aLower = a.toLowerCase();
        System.out.println(aLower);

        //////////CharAt()\\\\\\\\\\\\\\

        System.out.println(a.charAt(0));
        System.out.println(a.length());

        System.out.println(a.substring(0,4));

        System.out.println(a.contains("lo"));
        System.out.println(a.startsWith("H"));
        System.out.println(a.startsWith("World", 6));
    }
}
