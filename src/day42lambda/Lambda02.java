package day42lambda;

import day41Lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(7,11));

        System.out.println(getMultiplyInTheGivenRange(7,10));

        System.out.println(getSumOfDigitsInTheGivenRange(45,47));
    }
    //Swap icin bir tane private method olusturuyoruz

    private static List<Integer> swap (int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if (starting>ending){
            starting=starting + ending;
            ending=starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }


    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz

    public static int getSumInTheGivenRange(int starting, int ending){

  swap(starting,ending);

      return IntStream.rangeClosed(starting,ending).sum();
    }

    public static int getMultiplyInTheGivenRange(int i, int j) {
        swap(i,j);
        return IntStream.rangeClosed(i,j).reduce(Math::multiplyExact).getAsInt();
    }
    //Example 3: 45'den 47'ye kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.

    public static int getSumOfDigitsInTheGivenRange(int i ,int j){
        swap(i,j);
        return IntStream.rangeClosed(i,j).map(Utils::getSumOfDigits).sum();
    }
}
