import java.util.Scanner;
import java.util.HashMap;

public class CommonElementBetTwoArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fSize = scanner.nextInt();
        int[] firstSet = new int[fSize];

        for (int i = 0; i < fSize; i++) {
            firstSet[i] = scanner.nextInt();
        }

        int sSize = scanner.nextInt();
        int[] secondSet = new int[sSize];

        for (int i = 0; i < sSize; i++) {
            secondSet[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int x : firstSet) {
            hash.put(x, 1);
        }
        for (int x : secondSet) {
            hash.put(x, hash.getOrDefault(x, 0) + 1);
        }
        String out = "";
        for (int key : hash.keySet()) {
            if (hash.get(key) > 1) {
                out += key + " ";
            }
        }

        if (out.length() > 2) 
        {
            System.out.print(out);
        } else {
            System.out.print("No common elements");
        }
        int counter = 0;

    }
}