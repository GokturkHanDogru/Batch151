package day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{
    /*
    1)Eger RuntimeCustomException üretmek isterseniz Runtime Exception Class'a extend etmelisiniz.
     */

    public  IllegalAgeException(){
        super();
    }
    public  IllegalAgeException(String message){
        super(message);
    }
}
