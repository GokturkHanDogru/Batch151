package day27interface;
/*
1)"interface"in icine "concrete method" konulamaz
2)"interface" icindeki methodlarin abstract oldugunu Java bilir, bu yuzden "interface" icindeki
  "abstract method" larda "abstract" keyword kullanmaya gerek yoktur.
3)"interface" icindeki "abstract method" larin tamami "public" dir.
   Bu yuzden "interface" icinde abstract method olustururken "access modifier" yazmaya gerek yoktur
4)Bir "interface" i bir "class" in parent'i yapmak istediginizde "extends" keyword yerine
  "implemets" keyword kullaniniz
5) "Concrete Child Class"' lar "parent interface" daki "abstract method"lari override etmek zorundadirlar.
6)"interface" bir application da "Concrete Child Class"larin yapmak zorunda olduklari fonsiyonlari barindirirlar
   Bu yuzden "interface" lere "to-do list" de denir.
7)Birden fazla "parent interface" icinde ayni isimli abstract methodlar olusturabilirsiniz.
  abstract methodlarin body'si olmadigi icin child class'lar ayni isimli method'lardan herhangi
  birini override ederek kullanabilirler.
8)Birden fazla "parent interface" icinde ayni ismli abstract methodlar olusturdugunuzda bu
method'larin "return type"lari ayni olmak zorundadir.
9)Normalde "interface"in icine "concrete method" konulamaz ama bazi ozel durunlarda "concrete method" koymamiz gerekirse
  "default" keyword'unu asagidakai gibi kullanaraka interface icine concrete method koyabiliriz
        i) "default" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
    koyabiliriz. default void eco () { System.out.println("Uses gas less...");}
        ii) "static" keyword unu asagidaki gibi kullanarak "interface" icine "concrete method"
    koyabiliriz. static void stop () { System.out.println("Stops securely...");}
10)"default" veya "static" keyword'unu olusturdugunuz concrete methodla'in "concrete child class" lar tarafindan
   kullanilma zorunlulugu yoktur.
11)"default" keyword'unu kullanarak olusturdugunuz "concrete methodla"ra "object" olusturarak ulasilabilir
    "sttic" keyword'unu kullanarak olusturdugunuz "concrete methodla"ra ulasmak icin "object" olusturmaya gerek yoktur
   "interface" ismi yeterlidir.
12)interface'lerden object olusturulmaz interface'lerin constructori yoktur.
 */
public interface Engine {
    void start();

    void payment();

    default void eco(){
        System.out.println("Uses gas less...");
    }

    static void stop(){
        System.out.println("Stops securely...");
    }
}
