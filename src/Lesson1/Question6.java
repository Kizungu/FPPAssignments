package Lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        String[] names=new String[n];
        for (int i = 0; i < n; i++) {
            names[i]=sc.next();
        }
        //System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(findReverse(names)));

    }
    public static String[] findReverse(String[] str){
        int index=0;
        String[] arr2=new String[str.length];

        for (int i = 0; i < str.length; i++) {

            String temp = str[i];
            String x ="";
            for (int j = temp.length()-1; j>=0; j--) {
                x+=temp.charAt(j);

            }arr2[index]=x;
            index++;

            }
        return arr2;

        }
    }

