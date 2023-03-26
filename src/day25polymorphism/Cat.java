package day25polymorphism;

public class Cat extends Animal{

    @Override
    public void move() {
        System.out.println("Cats move...");
    }

    @Override
    protected int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public Animal create() {
        return new Cat();
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b*2;
    }

}
