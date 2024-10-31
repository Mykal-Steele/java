import java.util.Scanner;

/**
 * This program takes a string input from the user and a character input.
 * It then finds all occurrences of the character in the string and prints
 * their positions (0-based index). It also prints the count of occurrences.
 * If the character is not found, it prints "ERROR".
 */import java.util.Scanner;

public class sda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine().toLowerCase();
        String output = "";
        int counter = 0;
        char c = scanner.nextLine().toLowerCase().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            char cou = str.charAt(i);
            if (cou == c) {
                output += i + ", ";
                counter++;
            }
        }

        if (counter != 0) {
            output = output.substring(0, output.length() - 2);
            System.out.println(counter);
            System.out.println(output);
        } else {
            System.out.println("ERROR");
        }

        scanner.close();
    }
}
