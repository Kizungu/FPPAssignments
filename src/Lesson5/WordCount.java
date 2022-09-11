package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class WordCount {
    int count;

    public WordCount(int count) {
        if (count >= 0)
            this.count = count;
    }

    public int getCount() {

        return count;
    }

    public void setCount(int count) {

        this.count = count;
    }

    public int increaseCount() {
        count += 1;
        return count;
    }

    public int decreaseCount() {
        count -= 1;
        return count;
    }

    public int resetCount() {
        count = 0;
        return count;
    }

    public void printCount() {

        System.out.println(count);
    }


    public static class Question4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value to check:");
            String myName = sc.nextLine();
            System.out.println("enter Array Size:");
            int n = sc.nextInt();
            System.out.println("Create an Array of Strings:");
            String [] allNames=new String[n];
            for (int i = 0; i < allNames.length; i++) {
                allNames[i]=sc.next();
            }
            System.out.println(Arrays.toString(allNames));
            System.out.println(isContain(allNames,myName));

            }


        public static boolean isContain(String [] names,String name){
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(name)) {
                    return true;
                }

            }
            return false;
        }
    }
}
