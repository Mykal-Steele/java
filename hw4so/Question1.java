package hw4so;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String sec = scanner.nextLine();

        first = first.toLowerCase();
        sec = sec.toLowerCase();

        if (first.equals(sec)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
            
            if (first.length() > sec.length()) {
                System.out.println("The first string is longer.");
            } else if (sec.length() > first.length()) {
                System.out.println("The second string is longer.");
            }
            
            if (first.length() == sec.length() && !first.equals(sec)) {
                System.out.println("The strings have the same length but different content.");
            }

            if (first.compareTo(sec) > 0) {
                System.out.println("The first string comes after the second string lexicographically.");
            } else {
                System.out.println("The first string comes before the second string lexicographically.");
            }
        }
    }
}
