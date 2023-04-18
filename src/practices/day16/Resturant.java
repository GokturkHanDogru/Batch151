package practices.day16;

import java.util.ArrayList;

public class Resturant {

    private ArrayList<MenuItem> menu = new ArrayList<>();
    private static ArrayList<Order> order = new ArrayList<>();

    public static void main(String[] args) {

        MenuItem item1= new MenuItem(101,"Hamburger", 500);
        MenuItem item2= new MenuItem(102,"Pizza", 600);
        MenuItem item3= new MenuItem(103,"Köfte", 700);
        MenuItem item4= new MenuItem(104,"Salata", 100);
    }
}
