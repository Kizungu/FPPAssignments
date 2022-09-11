package Lesson5;

import java.util.Scanner;

public class WordCountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        WordCount cnt = new WordCount(text.length());
        System.out.println(cnt.count);

    }

}
