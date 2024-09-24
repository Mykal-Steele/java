
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        // Read a line of input from the user and store it in the variable 'inp'
        String inp = scanner.nextLine();
        
        // Check if the length of the input string is even
        if (inp.length() % 2 == 0) {
            // Print the length of the string
            System.out.println("Length: " + inp.length());
            // Print that the length is even
            System.out.println("The sentence length is even.");
        } else if (inp.length() % 2 == 1) {
            // Print the length of the string
            System.out.println("Length: " + inp.length());
            // Print that the length is odd
            System.out.println("The sentence length is odd.");
        }
    }
}
