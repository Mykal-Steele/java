package HelpfulPrograms;

import java.util.Scanner;

public class totalFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its prime factors and the total number of factors:");
        System.out.println("There are \"" + totalFac(scanner.nextInt()) + "\" factors in total.");
        scanner.close();
    }

    public static int totalFac(int number) {

        if (isItPrime(number)) {
            return 2;
        }
        StringBuilder sout = new StringBuilder("The prime factorization of " + number + " is: ");

        int totalFactors = 1;
        int prime = 2;

        int count = 0;
        while (number % prime == 0) {
            number /= prime;
            count++;
        }
        if (count > 0) {
            sout.append(prime).append("^").append(count).append(", ");
            totalFactors *= (count + 1);
        }

        prime = 3;
        while (prime <= Math.sqrt(number)) {
            count = 0;
            while (number % prime == 0) {
                number /= prime;
                count++;
            }
            if (count > 0) {
                sout.append(prime).append("^").append(count).append(", ");
                totalFactors *= (count + 1);
            }
            prime = findNextPrime(prime);
        }

        if (number > 1) {
            sout.append(number).append("^1, ");
            totalFactors *= (1 + 1);
        }

        // Remove the last ", " from sout
        if (sout.length() > 2) {
            sout.setLength(sout.length() - 2);
        }

        System.out.println(sout);
        return totalFactors;
    }

    public static boolean isItPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findNextPrime(int curPrime) {
        if (curPrime <= 1) {
            return 2;
        }

        curPrime++;

        if (curPrime == 2) {
            return curPrime;
        }

        if (curPrime % 2 == 0) {
            curPrime++;
        }

        while (true) {
            boolean isPrime = true;

            for (int i = 3; i <= Math.sqrt(curPrime); i += 2) {
                if (curPrime % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                return curPrime;
            }

            curPrime += 2;
        }
    }
}
