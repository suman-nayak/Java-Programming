package pack1;

import java.time.*;

public class DateTimeTasks {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDate futureDate = currentDate.plusDays(7);
        System.out.println(futureDate);

        LocalDate pastDate = currentDate.minusMonths(1);
        System.out.println(pastDate);
    }
}