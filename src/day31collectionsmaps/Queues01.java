package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
        Queue<String> warehouse = new LinkedList<>();

        warehouse.add("Milk");
        warehouse.add("Meat");
        warehouse.add("Bread");
        warehouse.add("Egg");
        warehouse.add("Cheese");
        System.out.println(warehouse);//[Milk, Meat, Bread, Egg, Cheese]

        warehouse.remove();
        System.out.println(warehouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(warehouse.peek());// Meat
        System.out.println(warehouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(warehouse.element());//Meat
        System.out.println(warehouse);//[Meat, Bread, Egg, Cheese]

        System.out.println(warehouse.poll());//Meat
        System.out.println(warehouse);//[Bread, Egg, Cheese]

        warehouse.clear();
        System.out.println(warehouse.poll());//null
        System.out.println(warehouse.remove());//Exception
    }
}
