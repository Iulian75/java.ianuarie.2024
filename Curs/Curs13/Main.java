package Curs.Curs13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Random random = new Random();
//        System.out.println(random.nextInt(1,100));
//
//        Scanner scanner = new Scanner(System.in);
//        int numarUtilizator = scanner.nextInt();
//        System.out.println("Numarul priit este:" + numarUtilizator);

        //Math

//        int numarulMaxim = Math.max(2,10);
//        System.out.println(numarulMaxim);

        //Array
//        int[] arrayNou = new int[] {10,20,30};
//        int numarElemente = arrayNou.length;
//        System.out.println(numarElemente);


        // -Write a program that prints the current date and time.
        //-Add 5 hours and 30 minutes to the current time and print it.
        //-From a given LocalDateTime, extract the date and time and print them separately.(methods: toLocalDate(), toLocalTime())
        //-Check if a given date-time is before or after the current date-time.(methods: LocalDateTime.of(), isBefore() )
        //-Convert a string representing date-time in the format yyyy-MM-dd HH:mm to LocalDateTime.
        //-Generate a random integer between 1 and 300.

        //Ex1

//        LocalDateTime currentDateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = currentDateTime.format(formatter);
//        System.out.println("Current date and time: " + formattedDateTime);

        //Ex2


//        LocalDateTime currentDateTime = LocalDateTime.now();
//
//        // Add 5 hours and 30 minutes
//        LocalDateTime modifiedDateTime = currentDateTime.plusHours(5).plusMinutes(30);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String formattedDateTime = modifiedDateTime.format(formatter);
//
//        System.out.println("Modified date and time: " + formattedDateTime);

        //Ex4

//        LocalDateTime currentDateTime = LocalDateTime.now();
//
//        LocalDateTime givenDateTime = LocalDateTime.of(2024, 2, 3, 13, 33);
//
//        if (givenDateTime.isBefore(currentDateTime)) {
//            System.out.println("Given date-time is before the current date-time.");
//        } else {
//            System.out.println("Given date-time is after or equal to the current date-time.");
//        }

        //Ex3

//        LocalDateTime givenDateTime = LocalDateTime.of(2024, 2, 3, 13, 30);
//
//
//        LocalDate date = givenDateTime.toLocalDate();
//        LocalTime time = givenDateTime.toLocalTime();
//
//
//        System.out.println("Date: " + date);
//        System.out.println("Time: " + time);


        //EX5
//        String dateTimeString = "2024-02-06 13:30";
//
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//
//
//        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
//        System.out.println("Parsed LocalDateTime: " + dateTime);


        //Ex6

//        Random random = new Random();
//
//        int randomNumber = random.nextInt(1,300);
//        System.out.println(randomNumber);



    }
}
