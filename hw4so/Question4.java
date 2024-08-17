package hw4so;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        System.out.println("Length: " + inp.length());
        scanner.close();
        if ((inp.length() % 2 == 0) && (inp.length() % 3 == 0)) {
            System.out.println("String after extracting: " + inp.substring(0, 6) + inp.substring(inp.length() - 6));
        } else if (inp.length() % 2 == 0) {
            System.out.println("String after extracting: " + inp.substring(0, 2) + inp.substring(inp.length() - 2));
        } else if (inp.length() % 3 == 0) {
            System.out.println("String after extracting: " + inp.substring(0, 3) + inp.substring(inp.length() - 3));
        }
    }
}
