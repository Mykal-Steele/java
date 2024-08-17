package hw4so;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Read a line of input from the user and store it in the variable 'inp'
        String inp = scanner.nextLine();
        
        // Print the length of the input string
        System.out.println("Length: " + inp.length());
        
        // Close the Scanner object as it's no longer needed
        scanner.close();
        
        // Check if the string length is divisible by both 2 and 3
        if ((inp.length() % 2 == 0) && (inp.length() % 3 == 0)) {
            // Extract the first 6 and last 6 characters and concatenate them
            System.out.println("String after extracting: " + inp.substring(0, 6) + inp.substring(inp.length() - 6));
        } 
        // Check if the string length is divisible by 2
        else if (inp.length() % 2 == 0) {
            // Extract the first 2 and last 2 characters and concatenate them
            System.out.println("String after extracting: " + inp.substring(0, 2) + inp.substring(inp.length() - 2));
        } 
        // Check if the string length is divisible by 3
        else if (inp.length() % 3 == 0) {
            // Extract the first 3 and last 3 characters and concatenate them
            System.out.println("String after extracting: " + inp.substring(0, 3) + inp.substring(inp.length() - 3));
        }
    }
}
