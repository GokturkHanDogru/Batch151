package day27interface;

public class CarRunner {
    public static void main(String[] args) {
        Engine.stop();// stop() methodu static oldugundan interface ismi ile ulastim.

        Honda  h1 = new Honda();

        h1.eco();// eco() methodu static olmadigindan object ismi ile ulastim.
    }
}
