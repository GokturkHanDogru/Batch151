package StudyGroup;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {

        LocalDate dogumGunuTarihi = LocalDate.of(1995,02,14);
        System.out.println("dogumGunuTarihi = " + dogumGunuTarihi);

        LocalDate bugünTarih =LocalDate.now();
        System.out.println("bugünTarih = " + bugünTarih);

        LocalDate kesinTarih = dogumGunuTarihi.plusYears(3).plusMonths(5).plusDays(15);
        System.out.println("kesinTarih = " + kesinTarih);

    }
}
