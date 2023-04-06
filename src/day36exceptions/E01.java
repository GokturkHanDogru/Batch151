package day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {
    /*
    1)Run Button'una bastiktan sonra alinan Exception'lara "Runtime Exception" denir.
    ArithmeticException, NullPointerException, NumberFormatException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException
    "Runtime Exception'a örnektir.
     "Runtime Exception" lara "Unchecked Exception" da denir.

    2)Code yazarken kirmizi alt cizgi seklinde alinan Exception'lara "Compile Time Exception" denir.
    FileNotFoundException, IOEException "Compile Time Exception'a örnektir.

    3)FileNotFoundException: Java'ya bir dosayayi bul dedigimizde, Java dosyanin adresi ve dosyanin varligi konusunda hata olusursa
    ne yapmasi gerektigini söyleminizi ister.

    4)IOEException: "IO" Input-Output demektir.
                    Note: IOException FileNotFoundException'in parent'idir.

    4)Java'da hatalar temelde ikiye ayrilir.
        i)Exceptionlar
        ii)Error'lar
            a)StackOverflow Error
            b)Out of Memory Error
            c)Virtuel Machine Error

     */
    public static void main(String[] args) throws IOException {

        //1.Way Exception'i method signature satirina ekledik.
        FileInputStream fis =new FileInputStream("src/day36exceptions/TextFile");

        int i = 0;

        while ((i = fis.read()) !=-1){

            System.out.print((char)i);
        }

        //2.Way

    }
}
