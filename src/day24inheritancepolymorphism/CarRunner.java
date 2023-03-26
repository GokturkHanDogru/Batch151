package day24inheritancepolymorphism;

public class CarRunner {
    public static void main(String[] args) {
        Toyota t1 = new Toyota();
      //  t1.model = "prius";
      //  System.out.println(t1.model);

        Honda h1 = new Honda();

        Volvo v1 = new Volvo();
            v1.move();
    }
}
