package day25polymorphism;

public class Student    {
    //Encapsulation nedir? Data saklamaktir.(Data hiding)
    //Datayi nasil saklarsin? Access Modifier'ini "private" yaparak.
    private String stdId ="AC2023120T";
    public String stdName = "Tom Hanks";
    public int age = 23;
    private double gpa = 3.18;

    private boolean succesful = false;


    //Encapsulation yaptigimiz data'yi istersek diger class'lardan okuyabiliriz
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
    //i)get method'lari hep "public" olur. ii) get method'un "return type"i okudugu variable'in return type'i ile ayni olur.
    //iii)get method bir boolean variable icin olusturulduysa ismi "is" ile baslar.
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }
    //Encapsulation yapilan variable'in data type'i "boolean" ise
    //get method ismi "is" ile baslar
    public boolean isSuccesful() {
        return succesful;
    }
//Encapsulation yaptigimiz data'yi istersek diger class'lardan nasil degistirebiliriz.
//Nasil degistirebiliriz?//"set method" olusturarak Encapsulate edilmis data'nin degerini degistirebiliriz
    //i) set Methodlari hep public olur
    //ii) set Methodun return typi void olur
    //iii) set method parametre kullanir, parametreinin data type'i variable ile ayni olur
    //iv) set method kullanarak var olan object üzerinde degisiklik yaparak o object'i sanki yeni bir objectmis gibi kullanabiliriz.

    public void setGpa(double gpa) {
        this.gpa = gpa;

    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }


}
