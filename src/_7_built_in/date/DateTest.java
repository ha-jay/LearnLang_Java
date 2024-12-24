package _7_built_in.date;

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest { 
    public static void main(String[] args) {
        //Date 클래스 사용 
        Date date = new Date(); 
        System.out.println("현재 날짜와 시간 : "+date); //Sat Dec 21 18:31:04 KST 2024


        //LocalDate 클래스 사용 = 날자를 yyyy-MM-dd 형식으로 출력
        LocalDate localDate = LocalDate.now();
        System.out.println("현재 날짜 : "+localDate); //2024-12-21

        //LocalTime 클래스 사용 = 시간을 HH:mm:ss 형식으로 출력
        LocalTime localTime = LocalTime.now();
        System.out.println("현재 시간 : "+localTime); //18:31:04


        //LocalDateTime 클래스 사용 = 날짜와 시간을 yyyy-MM-ddTHH:mm:ss 형식으로 출력
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("현재 날짜와 시간 : "+localDateTime); //2024-12-21T18:31:04.123

        //DateTimeFormatter 클래스 사용 = 날짜와 시간을 원하는 형식으로 출력
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//yyyy-MM-dd HH:mm:ss 형식으로 출력
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");//dd-MMM-yyyy 형식으로 출력
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");//yyyy-MM-dd HH:mm:ss 형식으로 출력
        System.out.println("현재 날짜와 시간 : "+localDateTime.format(formatter)); //2024-12-21 18:31:04
        System.out.println("현재 날짜와 시간 : "+localDateTime.format(formatter1)); //21-Dec-2024  21-12월-2024
        System.out.println("현재 날짜와 시간 : "+localDateTime.format(formatter2)); //Sat, Dec 21 2024 토, 12월 21 2024

        




    }
}
