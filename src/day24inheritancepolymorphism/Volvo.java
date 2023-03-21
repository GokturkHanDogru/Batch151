package day24inheritancepolymorphism;

public class Volvo extends Car {
    public void secure (){
        System.out.println("Volvo is secure");
    }

    @Override //@Override annotation'i Override kurallarini kontrol eder
    public void move() {
        System.out.println("Volvo moves");
    }

}
