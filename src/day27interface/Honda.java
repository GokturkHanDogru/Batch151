package day27interface;

public class Honda implements Engine, Break{

    @Override
    public void start() {
        System.out.println("Start...");
    }

    @Override
    public void payment() {
        System.out.println("Pay the brake...");
        System.out.println("Pay the engine...");
    }

    @Override
    public void slow() {
        System.out.println("Be slow...");
    }
}
