import java.util.Scanner;

/**
 * This program takes a string input from the user and a character input.
 * It then finds all occurrences of the character in the string and prints
 * their positions (0-based index). It also prints the count of occurrences.
 * If the character is not found, it prints "ERROR".
 */
public class sda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user and convert it to lowercase
        String str = scanner.nextLine().toLowerCase();

        // Initialize an empty string to store the positions of occurrences
        String output = "";
        // Counter to keep track of the number of occurrences
        int counter = 0;

        // Read the character input from the user, convert it to lowercase, and get the first character
        char c = scanner.nextLine().toLowerCase().charAt(0);

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Get the character at the current index
            char cou = str.charAt(i);
            // Check if the current character matches the input character
            if (cou == c) {
                // Append the index to the output string, followed by a comma and space
                output += i + ", ";
                // Increment the counter
                counter++;
            }
        }

        // Check if any occurrences were found
        if (counter != 0) {
            // Remove the trailing comma and space from the output string
            output = output.substring(0, output.length() - 2);
            // Print the number of occurrences
            System.out.println(counter);
            // Print the positions of the occurrences
            System.out.println(output);
        } else {
            // If no occurrences were found, print "ERROR"
            System.out.println("ERROR");
        }
        // Close the scanner to release resources
        scanner.close();
    }
}
