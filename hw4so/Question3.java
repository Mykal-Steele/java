package hw4so;

import java.util.Scanner;

/**
 * Question3
 */
public class Question3 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Read a line of input from the user and store it in the variable 'strx'
        String strx = scanner.nextLine();
        
        // Read an integer input from the user, representing an index in the string
        int charAtIndex = scanner.nextInt();
        // Consume the newline character after the integer input to avoid issues with subsequent inputs
        scanner.nextLine();  
        
        // Read the string to be replaced from the user
        String toReplace = scanner.nextLine();
        // Read the string that will replace the above string
        String replacewith = scanner.nextLine();
        
        // Print the length of the input string
        System.out.println("Length: " + strx.length());
        // Convert and print the string in upper case
        System.out.println("Upper case: " + strx.toUpperCase());
        // Convert and print the string in lower case
        System.out.println("Lower case: " + strx.toLowerCase());
        // Extract and print the first character of the string
        System.out.println("First character: " + strx.substring(0, 1));
        // Extract and print the last character of the string
        System.out.println("Last character: " + strx.substring(strx.length() - 1));
        
        // Extract the character at the specified index and print it
        char charr = strx.charAt(charAtIndex);
        System.out.println("Character at index no. " + charAtIndex + ": " + charr);
        
        // Replace occurrences of 'toReplace' in the string with 'replacewith' and print the result
        String rep = strx.replace(toReplace, replacewith);
        System.out.println("String after replacing " + toReplace + " with " + replacewith + ": " + rep);
    }
}
