package day35exceptions;

public class E03 {

    /*
            1)try block'dan sonra coklu catch block kullanilabilir.
              catch block'lar arasinda parent-child iliskisi yoksa catch block'lar istenildigi gibi siralanabilir.
              catch block'lar arasinda parent-child iliskisi varsa child ustte olmalidir

            2)"Exception Class"tum Exception'larin parent'idir.
               Coklu catch block kullanmak yerine sizden istenen fonksiyonu karsiladigi surece
               tek catch block'i "Exception Class" ile kullanabilirsiniz

            3)"try + 1 catch" olur - "try + cok catch" olur - "try" tek basina kullanilamaz

              "try" catch block olmadan kullanilabilir mi?
              "try + finally" olabilir.

     */

    public static void main(String[] args) {

        System.out.println(convertStringtoIntDivideByLength1("2"));
        System.out.println(convertStringtoIntDivideByLength2("2"));
        System.out.println(convertStringtoIntDivideByLength3("2"));

    }
    //Example 1 : Bir String'i Integer'a ceviren ve bu Integer'i String'in length'inin bi eksigine bolen method olusturunuz

    public static int convertStringtoIntDivideByLength1(String str){
        int result =0;

     try {
         Integer a = Integer.valueOf(str);
         result =  a/(str.length()-1);

     }catch (NumberFormatException e){
         System.out.println("Non-digit character can not be used in valueof()");

     }catch (ArithmeticException e){
         System.out.println(e.getMessage());
     }
     return result;
    }

    public static int convertStringtoIntDivideByLength2(String str){
        int result =0;

        try {
            Integer a = Integer.valueOf(str);
            result =  a/(str.length()-1);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
    public static int convertStringtoIntDivideByLength3(String str){
        int result =0;

        try {
            Integer a = Integer.valueOf(str);
            result =  a/(str.length()-1);

        }catch (ArithmeticException e) {
            System.out.println("Jump");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}
