import java.util.Scanner;

public class Stepback {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        // Determine which number is greater
        int greater = Math.max(start, end);
        int smaller = Math.min(start, end);
        
        // Print the sequence
        for (int i = greater; i >= smaller; i--) {
            for (int j = greater; j >= smaller; j--) {
                if (j >= i) {
                    System.out.print(j + " ");
                }
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}