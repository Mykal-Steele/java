import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character
        String[] sp = new String[counter];
        for (int i = 0; i < counter; i++) {
            sp[i] = scanner.nextLine().toLowerCase();
        }

        String output = "";
        for (String word : sp) {
            // Reverse the word directly in the loop
            int len = word.length();
            String reversedWord = "";
            for (int i = len - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }

            // Capitalize the first letter of the reversed word and add it to the output
            output += Character.toUpperCase(reversedWord.charAt(0)) + reversedWord.substring(1) + " ";
        }

        System.out.println(output.trim());
        scanner.close(); // Close the scanner
    }
}
    