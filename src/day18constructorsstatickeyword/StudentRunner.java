package day18constructorsstatickeyword;

public class StudentRunner {
    public static void main(String[] args) {

        // static olan numofRegisteredStd variableini cagirmak icin sadece class ismini kullandik, object olusturmadik
        System.out.println(Student.numOfRegisteredStd);

        //static olmayan num variableini cagirmak icin object olusturduk
        Student s1 = new Student();
        System.out.println(s1.num);
    }
}
