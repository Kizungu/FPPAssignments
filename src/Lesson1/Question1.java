package Lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = sc.nextInt();
        int arr []= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("my original array will be :");
        System.out.println(Arrays.toString(arr));
        //Question1 Q1 = new Question1();
        System.out.println(findAverage(arr));
    }
    public static int  findAverage(int [] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
           sum+=arr[i];
        }
        int aver= sum/arr.length;
       return aver;
    }

}
