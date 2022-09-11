package Lesson1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value1");
        int x =sc.nextInt();
        System.out.println("Enter value2");
        int y = sc.nextInt();
        System.out.println("Enter value3");
        int z = sc.nextInt();
        System.out.println("The maximum value among my values is:");
        System.out.println(findMax(x,y,z));



    }
    public static int findMax(int n1,int n2,int n3){
        int max =0;
        if(n1>n2&& n1>n3){
            max=n1;
        }
        else if(n2>n1 && n2>n3){
            max=n2;
        }else max=n3;
        return max;
    }

}
