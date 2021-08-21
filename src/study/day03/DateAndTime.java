package study.day03;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {

        Date nowDate = new Date();
        System.out.println(nowDate.getDay());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
        String formatDate = formatter.format(nowDate);
        System.out.println(nowDate); // Wed Aug 18 23:27:47 KST 2021
        System.out.println(formatDate); // 2021년 08월 18일
        System.out.println(nowDate.getTime()); // 1629297635660

        LocalTime time = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        Instant instant = Instant.now();


        System.out.println(time); // 23:27:47.781
        System.out.println(localDate); // 2021-08-18
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"))); //2021년 08월 18일

    }
}
