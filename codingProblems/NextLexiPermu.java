import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;

public class NextLexiPermu {
    
    // Utility function to find the index of a target element in an array
    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        boolean maxLexi = true;  // Flag to check if array is in descending order (last permutation)
        
        // Read the array elements
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Check if the array is in descending order (i.e., the largest permutation)
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                maxLexi = false;
                break;
            }
        }
        
        // If the array is in descending order, reverse it to get the smallest permutation
        if (maxLexi) {
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        } else {
            int pivotIndex = -1;  // Variable to store the "pivot" index

            // Find the first pair from the end where arr[i] < arr[i + 1]
            for (int i = size - 1; i >= 1; i--) {
                if (arr[i] - arr[i - 1] > 0) {
                    pivotIndex = i - 1;  // Store index of the pivot
                    break;
                }
            }
            
            // HashMap to store potential swap candidates and their differences from pivot element
            HashMap<Integer, Integer> hm = new HashMap<>();
            ArrayList<Integer> arraylist = new ArrayList<>();
            
            // Populate the HashMap with elements greater than the pivot element
            for (int i = pivotIndex; i < arr.length; i++) { 
                if (i > pivotIndex) {
                    arraylist.add(arr[i]);
                }
                if (i + 1 < arr.length && arr[i + 1] > arr[i]) {  
                    hm.put(arr[i + 1], arr[i + 1] - arr[i]);  // Store the difference to help find the smallest greater element
                }
            }
            
            // Find the minimum difference element greater than pivot (closest larger element)
            int Min = Integer.MAX_VALUE;
            int toSwap = 0;
            for (int key : hm.keySet()) { 
                if (hm.get(key) < Min) {
                    Min = hm.get(key); 
                    toSwap = key;  // Set the element to swap
                }
            }
            
            // Find the index of the element to swap with the pivot element
            int toSwapIndex = findIndex(arr, toSwap);
            
            // Swap pivot element with the smallest greater element
            int temp = arr[pivotIndex];
            arr[pivotIndex] = arr[toSwapIndex];
            arr[toSwapIndex] = temp;
            
            // Reverse the elements after the pivot to get the next lexicographical order
            Collections.reverse(arraylist);
            int index = 0;
            for (int i = pivotIndex + 1; i < arr.length && index < arraylist.size(); i++) {  
                arr[i] = arraylist.get(index++);
            }
            
            // Output the resulting array as the next permutation
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
