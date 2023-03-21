package day24inheritancepolymorphism;

public class Toyota  extends Car{
    public void hybrid (){
        System.out.println("Toyoto is hybrid");
    }

    public Toyota(){
        System.out.println("Toyota constructor 1");
    }

    public Toyota(String s){
        //super(5);
        System.out.println("Toyota constructor 2");
    }
}
