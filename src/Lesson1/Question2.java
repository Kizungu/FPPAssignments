package Lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let me create my Array with n length");
        int n = sc.nextInt();
        int arr []= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("my original array will be :");
        System.out.println(Arrays.toString(arr));
        //Question1 Q1 = new Question1();
        System.out.println(Arrays.toString(evenAndOddCounts(arr)));

    }
    public static int [] evenAndOddCounts(int [] values){
        int countEven=0;
        int countOdd=0;
        for (int i = 0; i < values.length; i++) {
            if (values[i]%2==0){
                countEven++;
            }
            else
                countOdd++;
        }
        int [] arr= {countEven,countOdd};
        return arr;
    }
}
