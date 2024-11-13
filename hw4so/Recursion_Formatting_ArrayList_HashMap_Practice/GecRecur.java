package Recursion_Formatting_ArrayList_HashMap_Practice;

import java.util.Scanner;

public class GecRecur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = Gcd(x, y);
        System.out.println(z);
    }

    private static int Gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return Gcd(y, x % y);
        }
    }
}
