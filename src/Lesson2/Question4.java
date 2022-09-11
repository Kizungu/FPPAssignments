package Lesson2;

import java.awt.*;

public class Question4 {
    public static void main(String[] args) {
        int[] num= {200,364,879,1000};
        findMinAndMax(num);

    }
    public static void findMinAndMax(int[]arr){
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];
        }
        System.out.println("The Maximum number in my array is " + max);
        System.out.println("The Minimun number in my array is " + min);
    }
}
