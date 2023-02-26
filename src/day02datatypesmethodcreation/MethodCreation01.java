package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {
     int total =    plus(5,7);
        System.out.println(total);

     long multotal =  multiply(3,6);
        System.out.println(multotal);

     double subtotal =  total(5,2,3);
        System.out.println(subtotal);

        System.out.println(getCube(3));
        print("Hello World");
    }
    public static int plus(int x, int y){
        return x+y;
    }
    protected static long multiply(int x, int y){
        return x*y;
    }
    private static double total(double x, double y, double z){
        return x*y+z;
    }
    static double getCube(double x){
        return x*x*x;
    }
    public static void print (String str){
        System.out.println(str);
    }

}
