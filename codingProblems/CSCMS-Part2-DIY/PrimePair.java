import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class PrimePair {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        ArrayList<Integer> primes = new ArrayList<>();
        for (int num : arr) {
            if (num > 1 && isPrime(num)) {
                primes.add(num);
            }
        }

        if (primes.size() < 2) {
            System.out.print("No prime pair was found.");
            return;
        }

        int[] diffs = new int[primes.size() - 1];
        for (int i = 0; i + 1 < primes.size(); i++) {
            diffs[i] = primes.get(i + 1) - primes.get(i);
        }
        
        Arrays.sort(diffs);

        System.out.print(diffs.length > 1 && diffs[0] != diffs[1] ? diffs[0] : "No prime pair was found.");
    }

    private static boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}