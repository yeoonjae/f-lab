package study.week02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class timeTest {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
