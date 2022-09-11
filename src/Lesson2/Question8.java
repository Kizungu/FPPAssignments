package Lesson2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Random randomGenerator=new Random();
        Scanner Sc = new Scanner(System.in);
        ArrayList<String> FortuneList=new ArrayList<>();
        FortuneList.add("You will get 4.0 GPA this semester.");
        FortuneList.add("Happiness is programming.");
        FortuneList.add("Satisfaction follows hard work.");
        FortuneList.add("Patience is virtue.");
        FortuneList.add("Travelling is on the best Experience everyone need to know");
        FortuneList.add("easy day,today");
        FortuneList.add("Difficult day,today");
        FortuneList.add("I Expect high score in the recent exam");
        FortuneList.add("My dedication is to pass this class no matter what");
        FortuneList.add("I will try my best to pass this class");


        System.out.println("Fortune (Y/N)?");
        char choice = Sc.next().charAt(0);
        while (choice=='Y'){
            int r=randomGenerator.nextInt(4);
            System.out.println("your fortune is : "+FortuneList.get(r));
            System.out.println("Fortune(Y/N)?");
            choice = Sc.next().charAt(0);
        }




    }
}

