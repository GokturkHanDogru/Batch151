package day20arrayslistdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        LocalDate myCurrentDate = LocalDate.now();
        System.out.println(myCurrentDate);

        int monthValue = myCurrentDate.getMonthValue();
        System.out.println(monthValue);

        int yearValue = myCurrentDate.getYear();
        System.out.println(yearValue);

        int dayValue = myCurrentDate.getDayOfMonth();
        System.out.println(dayValue);

        Month monthName = myCurrentDate.getMonth();
        System.out.println(monthName);

        DayOfWeek dayName = myCurrentDate.getDayOfWeek()    ;
        System.out.println(dayName);

        // Printing of Future Date
        System.out.println(myCurrentDate.plusDays(5).plusMonths(2).plusYears(4));

        //Printig of Previous Date
        System.out.println(myCurrentDate.minusYears(25).minusMonths(6).minusDays(7));

        //Comparing of Two diff. dates
        LocalDate birthday = LocalDate.of(1986,6,10);
        boolean isBefore = myCurrentDate.isBefore(birthday); //isAfter or isEqual
        System.out.println(isBefore);


        //Ex:1 if the date that entered from user is an old date Write " Invalid Date "
        // if date is a future date Write " Plese Write Time"


        System.out.println("Please Enter Numbers of the date with in the given order Year-Month-Day");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDAte = LocalDate.of(year,month,day);

        if (givenDAte.isBefore(LocalDate.now())){
            System.out.println(givenDAte + "Invalid Date");
        }else {
            System.out.println("Enter Time for Ticket");
        }

        int lengthOfMonth = myCurrentDate.lengthOfMonth();
        System.out.println(lengthOfMonth);//31

        //

        System.out.println("Please Enter Numbers of the date with in the given order Year-Month-Day");
        int year1 = input.nextInt();
        int month1 = input.nextInt();
        int day1 = input.nextInt();

        LocalDate givenDAte1 = LocalDate.of(year1,month1,day1);

        System.out.println(givenDAte1.getDayOfWeek());

    }
}
