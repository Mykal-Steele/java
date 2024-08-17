package hw4so;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read two lines of input from the user and store them in variables
        String first = scanner.nextLine();
        String sec = scanner.nextLine();

        // Convert both strings to lowercase to ensure case-insensitive comparison
        first = first.toLowerCase();
        sec = sec.toLowerCase();

        // Check if the two strings are exactly the same
        if (first.equals(sec)) {
            System.out.println("The strings are equal.");
        } else {
            // If strings are not the same, print that they are not equal
            System.out.println("The strings are not equal.");
            
            // Check which string is longer and print the result
            if (first.length() > sec.length()) {
                System.out.println("The first string is longer.");
            } else if (sec.length() > first.length()) {
                System.out.println("The second string is longer.");
            }
            
            // If the strings are of the same length but differ in content, print the result
            if (first.length() == sec.length() && !first.equals(sec)) {
                System.out.println("The strings have the same length but different content.");
            }

            // Compare the strings lexicographically (alphabetical order)
            if (first.compareTo(sec) > 0) {
                System.out.println("The first string comes after the second string lexicographically.");
            } else {
                System.out.println("The first string comes before the second string lexicographically.");
            }
        }
    }
}
