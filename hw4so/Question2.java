package hw4so;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        
        if (inp.length() % 2 == 0) {
            System.out.println("Length: " + inp.length());
            System.out.println("The sentence length is even.");
        } else if (inp.length() % 2 == 1) {
            System.out.println("Length: " + inp.length());
            System.out.println("The sentence length is odd.");
        }
    }
}
