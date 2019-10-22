package Chapter4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int moth = date.getMonthValue();
        int today = date.getDayOfMonth();

       date = date.minusDays(today-1);

        DayOfWeek weekday = date.getDayOfWeek();

        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sut Sun");

        for (int i = 1; i <value; i++){
            System.out.print(" ");

            while (date.getMonthValue() == moth){
                System.out.println( date.getDayOfMonth());
                if (date.getMonthValue() == today) System.out.print("*");
                else
                    System.out.print("");
                date = date.plusDays(1);

                if (date.getDayOfWeek().getValue() == 1) System.out.println();
            }
            if (date.getDayOfWeek().getValue() != 1) System.out.println();
        }


    }
}
