package day28interface;
/* Child    Parent
   Class--> Class : extends
   interface--> interface : extends
   Class--> interface : implements
   interface --> Class : Olamaz...
   Ayni ise "extends" farkli ise "implements" kullan
   "interface"i class'in child'i yapma


   abstract class ile interface arasindaki farklar nelerdir?

*1)Abstract Class'lar hem "abstract" hem de "concrete" method'lar icerebilir fakat interface'ler sadece "abstract" method icerir.
Ama inderface'lerde istersek "default" ve "static" keyword'lerini kullanarak "concrete" method uretebiliriz.
*2)Abstract Class'lar multuple inheritance'i desteklemez ama interface'ler destekler.
*3)Abstract Class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static ve final olmak zorundadir.
4)"interface" Class'in child'i olamaz ama "abstract class" class'in child'i olabilir.
5)abstract class'larda constructor vardir ama object uretemez, interface'lerde constructor yoktur bu yuzden object uretilemez.
 */
public interface Animal {

    void eat();
    void drink();
    //1) interfacedeki tüm variable'lar otomatik olarak "final"dir.
    //Bu yüzden interface icindeki variable'i olustudugunuzda deger atamasi yapmalisiniz.
    //Bilindigi gibi final variable'larin degerleri degistirelemez.
    //2)interfacelerdeki tüm variable'lar otomatik olarak public'tir.
    //3)interfacelerdeki tüm variable'lar otomatik olarak static'tir.
    int age =2;

}
