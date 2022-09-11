package Lesson5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class CalAge {
    private int current_Year = Year.now().getValue();
    private int current_Month = MonthDay.now().getMonthValue();
    private int years;
    private int months;
    private int days;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");


    public CalAge(int year, int month, int day) {
        this.years = year;
        this.months = month;
        this.days = day;
    }

    public void setDays(int day) {
        this.days = day;
    }

    public double CalculateAge() {
        double age = ((current_Year - years) - (current_Month - months) / 10);
        return age;
    }

    public  Period calculateAge(LocalDate birthday) {
        LocalDate today = LocalDate.now();
        return Period.between(birthday, today); // Return periods as Year, Month and Days
    }

    public  LocalDate getBirthday() {
        Scanner scanner = new Scanner(System.in);
        LocalDate birthday;
        while (true) {
            System.out.println("Please enter your birthday " + "in yyyy-MM-dd format (e.g. 1980-9-28): ");
            String input = scanner.nextLine();
            try {
                birthday = LocalDate.parse(input, formatter);

                return birthday;

            } catch (DateTimeParseException e) {
                System.out.println("Error! Please try again");
            }
        }

    }

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter year");
            int y =input.nextInt();
            System.out.println("enter month");
            int m =input.nextInt() ;
            System.out.println("enter day");
            int d =input.nextInt();
            CalAge age = new CalAge(y,m,d);
            System.out.println(age.CalculateAge() + " years");
            System.out.println(age.getBirthday());
        }
    }




