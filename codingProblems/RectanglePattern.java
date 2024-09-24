import java.util.Scanner;

public class RectanglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the rectangle
        System.out.print("Enter the size of the rectangle: ");
        int n = scanner.nextInt();
        
        // Print the rectangle pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*"); // Print the rectangle with '*' characters
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        scanner.close();
    }
}
