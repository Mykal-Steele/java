import java.util.Scanner;

public class NumberOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] counts = new int[101]; 

        int input;
        while ((input = scanner.nextInt()) != 0) {
            if (1 <= input && input <= 100) {
                counts[input]++; 
            }
        }

      
        for (int i = 1; i <= 100; i++) {
            if (counts[i] > 0) {
                System.out.print(i + " occurs " + (counts[i] > 1 ? counts[i] + " times" : "1 time"));
                System.out.println();
            }
        }
        scanner.close();
    }
}