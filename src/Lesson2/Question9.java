package Lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        String input;
        String dnaFragment;
        int length;
        Scanner keyboard = new Scanner(System.in);
        while(true){
            ArrayList<String> codon = new ArrayList<>();
            System.out.println("Enter Input of your choice: ");
            input = keyboard.nextLine();
            length = input.length()-1;
            if(input.length()<1){
                break;
            }
            int countDNA = 0;
            for (int i = 0; i <= length; i++) {
                countDNA++;
                if(i==length&&(length+1)%3==2){
                    break;
                }
                else{
                    if(countDNA%3==0){
                        dnaFragment = input.substring(countDNA-3,countDNA);
                        codon.add(dnaFragment);
                    }
                }

            }
            System.out.println("codons: ");
            for (String P : codon) {
                System.out.println(P);
            }

        }
        System.out.println("End program");
    }
}




