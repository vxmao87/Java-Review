package parameters;

import java.util.*;

public class random2 {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        vertical("what happens now");
        System.out.println();
        printReverse("what happens now");
        System.out.println();
        inputBirthday(console);
        System.out.println();
        printChristmasTree(3, 4);
    }
    
    public static void vertical(String sentence) {
        for(int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }
    }

    public static void printReverse(String sentence) {
        for(int i = sentence.length() - 1; i >= 0; i--) {
            System.out.print(sentence.charAt(i));
        }
    }

    public static void inputBirthday(Scanner console) {
        System.out.println("On what day of the month were you born? ");
        int day = console.nextInt();
        System.out.println("What month were you born?");
        String month = console.next();
        System.out.println("What year were you born?");
        int year = console.nextInt();
        System.out.println("You were born on " + month + " " + day + ", " + year + "!");
    }

    public static void printChristmasTree(int seg, int height) {
        for(int x = 1; x <= seg; x++) {
            for(int y = 1; y < height; y++) {
                for(int i = 0; i < )
            }
        }
    }
}
