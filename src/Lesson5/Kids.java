package Lesson5;

import java.util.Scanner;

public class Kids extends Book{
    public Kids(String id, String bookCategory, String author, String title, String publisher, double sellingPrice, int quantity) {
        super(id,bookCategory,author,title,publisher,sellingPrice,quantity);

    }


    public static class CountWords {
        public static void main(String[] args) {
            CountWords counts= new CountWords();
        }
        private int count;
        public CountWords() {
           displayResult();
        }
        public void setCounter() {
            count = 0;
        }
        public void couterIncrement() {
            count++;
        }
        public void counterDecrement() {
            if (count > 0)
                count--;
        }
        public int getCount() {
            return count;
        }
        public void printOnConsole() {
            System.out.println("The number of words are: " + this.getCount());
        }
        public void countTheWords() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your statement");
            String word = input.nextLine();
            String[] text = word.split(" ");
            for (int i = 0; i < text.length; i++) {
                if (text[i].startsWith("a") || text[i].startsWith("A"))
                    counterDecrement();
                else
                    couterIncrement();
            }
        }

        // This is a display result method
        public void displayResult() {
            countTheWords();
            printOnConsole();
        }

    }
}
