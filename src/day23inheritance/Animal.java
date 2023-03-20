package day23inheritance;

public class Animal {

     /*
        1)eat() methodu gibi bircok class'in kullanmasi gereken methodlari her class'a...ayri yari yazarsak)
        i)Tekrar yapmis oluruz
        ii)Ayni Method'u tekrar yazmak zaman kaybidir.
        iii)Tekrar tekrar yazilan kodun tamir, gelistirilmesi  cok zaman alir
        iv)...... atomik yapiya terstir.
        Inheritance = Miras (Senin  olmayan seyi senin gibi kullanirsin)
        2) Private class memberlar child classlar tarafindan kullanilamaz.
       Default class memberlar ayni packagede child classlar tarafindan kullanilabilirler.
       protected class memberlar farkli ppackagede de olsalar child classlar tarafindan kullanilabilir.
    3) Javada bir Classin sadece bir tane parenti olabilir.
       Coklu parenta "Multiple Inheritance" derler, tekli parenta "Single Inheritance" derler.
       Java "Multiple Inheritance"i desteklemez, java "Single Inheritance" kullanir
     */

    public void eat(){
        System.out.println("Animals eat...");
    }

    public void drink(){
        System.out.println("Animals drink...");
    }

}
