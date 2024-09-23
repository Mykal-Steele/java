import java.util.ArrayList;
import java.util.Scanner;

public class ArraySortingAndReversing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        ArrayList<Integer> reAr = new ArrayList<>();
        for (int i = size - 1; i >= 0; i--) {
            reAr.add(arr[i]);
        }

        
        System.out.println(reAr.toString().replaceAll("[\\[\\],]", ""));
    }
}