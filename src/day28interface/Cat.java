package day28interface;

public class Cat implements Mamal{

    @Override
    public void eat() {
    }

    @Override
    public void drink() {
    }

    public static void main(String[] args) {
        //interface'lerde variable cagirirken interface adini kullanarak cagirin.
        //  Bu hem static variable olmanin geregidir hem de okunurlulugu artirir.
        System.out.println(Animal.age);
        System.out.println(Mamal.feedBaby);
        System.out.println(Mamal.age);
    }
}
