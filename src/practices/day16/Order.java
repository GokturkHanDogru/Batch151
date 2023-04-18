package practices.day16;

import java.util.HashMap;

public class Order {

    private static int orderCount = 1000;
    private int orderCode;
    private HashMap<MenuItem,Integer> items = new HashMap<>();//items hashmap'inin icinde (pizza,2 adet)
    private double totalAmount =0;

    public Order() {
      orderCode=   orderCount++;

    }

    public void addItem (MenuItem item, int adet){
        items.put(item,adet);
        totalAmount+=item.getPrice()*adet;
    }
    public static int getOrderCount() {
        return orderCount;
    }

    public int getOrderCode() {
        return orderCode;
    }

    public HashMap<MenuItem, Integer> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
