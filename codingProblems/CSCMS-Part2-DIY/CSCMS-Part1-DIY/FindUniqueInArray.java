import java.util.Scanner;
import java.util.HashMap;

public class FindUniqueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        
        for (int x : arr) {
            hashmap.put(x, hashmap.getOrDefault(x, 0) + 1);
        }
        int unique = 0;
        for (int key : hashmap.keySet()) {
            if (hashmap.get(key) == 1) {
                unique = key;
                break;
            }
        }

        System.out.print(unique);
    }
}
