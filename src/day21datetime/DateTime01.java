package day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);

        int hour = myCurrentTime.getHour();
        System.out.println(hour);

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);

        int second = myCurrentTime.getSecond();
        System.out.println(second);

        // Futue and Passed Time

        LocalTime future = myCurrentTime.plusMinutes(23);
        System.out.println(future);

        LocalTime past = myCurrentTime.minusHours(3);
        System.out.println(past);

        // Time Changing
        DateTimeFormatter  dtf1 = DateTimeFormatter.ofPattern("hh:mm a");

        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);

        //Date Changing
        LocalDate myCurrentDate = LocalDate.of(2022,8,25);
        System.out.println(myCurrentDate);

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);

        // Date Formating 22/Aug/22
       DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentTime);
        System.out.println(formattedMyCurrentDate2);


        //25/August/2022
       DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formatted1 = dtf4.format(myCurrentTime);
        System.out.println(dtf4);


        //Learnig Local Time Zone

        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        // Time Zone
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);





    }
}
