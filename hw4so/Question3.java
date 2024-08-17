package hw4so;

import java.util.Scanner;

/**
 * Question3
 */
public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String strx = scanner.nextLine();
        int charAtIndex = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character after the integer input
        
        String toReplace = scanner.nextLine();
        String replacewith = scanner.nextLine();
        
        System.out.println("Length: " + strx.length());
        System.out.println("Upper case: " + strx.toUpperCase());
        System.out.println("Lower case: " + strx.toLowerCase());
        System.out.println("First character: " + strx.substring(0, 1));
        System.out.println("Last character: " + strx.substring(strx.length() - 1));
        
        char charr = strx.charAt(charAtIndex);
        System.out.println("Character at index no. " + charAtIndex + ": " + charr);
        
        String rep = strx.replace(toReplace, replacewith);
        System.out.println("string after replacing " + toReplace + " with " + replacewith + ": " + rep);
    }
}