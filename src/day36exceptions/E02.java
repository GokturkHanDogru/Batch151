package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {


        //2.Way
        try {
            FileInputStream fis = new FileInputStream("src/day36exceptions/TextFile");

            int i =0;

            while ((i= fis.read()) != -1);
            System.out.print((char)i);
        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
