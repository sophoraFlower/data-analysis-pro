package date;

import java.time.LocalDate;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        Date s = new Date();
        System.out.println(s.toString());
        Date deadline;
        deadline = s;

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(1999, 12, 31));
        LocalDate localDate = LocalDate.of(2022, 05, 26);
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
