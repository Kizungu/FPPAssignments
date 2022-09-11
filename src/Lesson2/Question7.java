package Lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        int maxRange;

        //create objects
        Scanner SC = new Scanner(System.in);
        Random rand = new Random();
        double[] temp = new double[365];

        System.out.print("Please enter maximum range: ");
       maxRange=SC.nextInt();

        for (int i = 0; i < temp.length; i++) {
            temp[i] =rand.nextInt(maxRange);
        }
        System.out.println(Arrays.toString(temp));
        hotAndCold(temp);


    }


    public static void hotAndCold(double[] temperatures) {
        double max=temperatures[0];
        double min = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if(temperatures[i]>max)
                max=temperatures[i];
            else if(temperatures[i]<min)
                min=temperatures[i];
        }
        System.out.println("The maximum temperature is" + max);
        System.out.println("The minimum temperature is " + min);

    }
}
