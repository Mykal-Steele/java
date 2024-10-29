import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
public class PermutationOfArrays{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        boolean maxLexi = true;
        arr[0] = scanner.nextInt();
        for(int i = 1; i < size; i++){
            arr[i] = scanner.nextInt();
            if (arr[i-1] < arr[i]) {
                maxLexi = false;
            }
        }
       
        if(maxLexi){
            StringBuilder sb = new StringBuilder();
            for(int i = size - 1; i >= 0; i--){
                sb.append(arr[i]).append(' ');
            }
            System.out.print(sb);
        }else{
            int pivotIndex = -1;
            int minDiff = Integer.MAX_VALUE;
            int toSwap = 0;
            int toSwapIndex = -1;

            for(int i = size - 1; i >= 1; i--){
                if(pivotIndex == -1 && arr[i] > arr[i-1]){
                    pivotIndex = i - 1;
                    for(int j = size - 1; j > pivotIndex; j--){
                        int diff = arr[j] - arr[pivotIndex];
                        if(diff > 0 && diff < minDiff){
                            minDiff = diff;
                            toSwap = arr[j];
                            toSwapIndex = j;
                        }
                    }
                }
            }
            
        
            int temp = arr[pivotIndex];
            arr[pivotIndex] = toSwap;
            arr[toSwapIndex] = temp;
            
            for(int i = pivotIndex + 1, j = size - 1; i < j; i++, j--){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < size; i++){
                sb.append(arr[i]).append(' ');
            }
            System.out.print(sb);
        }
    }
}