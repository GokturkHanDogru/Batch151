package day24inheritancepolymorphism;
/*
    1) Inheritance'da object olustururken constructor'lar yukaridan(Parent)
       asagiya(Child) dogru calisir.
    2)Parent ve Super es anlamlidir, Child ve Sub es anlamlidir.
    3)super() her constructor'in ilk satirinda gorunmez olarak bulunur.
      Isterseniz gorunur sekilde de yazabilirsiniz
    4)super() sizi parent class'daki constructor'a tasir..
    5)this() sizi ayni class icindeki constructor'lar arasinda gezdirir.
    6)"this" icinde bulundugunuz class'daki variable'lari cagirmaya yarar.
      "super" parent class'daki variable'lari cagirmaya yarar
    7) Data type lar arqasinda IS-A ve HAS-A iliskisi varsa bu data type larina "COVARIANT" denir.


 */
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
