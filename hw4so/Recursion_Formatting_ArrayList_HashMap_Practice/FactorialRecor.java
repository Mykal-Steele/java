package Recursion_Formatting_ArrayList_HashMap_Practice;

import java.util.Scanner;

public class FactorialRecor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        if(x < 0){
            System.out.print("Invalid Number!");
            return;
        }
        System.out.print(fac(x));
    }

    private static long fac(long x) {
        if(x == 0) return 1;
        return x * fac(x - 1);
    }
}
