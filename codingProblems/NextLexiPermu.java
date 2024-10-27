import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
public class NextLexiPermu{
    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        
        boolean maxLexi = true;
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                maxLexi = false;
                break;
            }
        }
       
        if(maxLexi){
            for(int i = size - 1; i >= 0; i--){
                System.out.print(arr[i] + " ");
            }
        }else{
            int pivotIndex = -1;  
            for(int i = size - 1; i >= 1; i--){
                if(arr[i] - arr[i-1] > 0){
                    
                    pivotIndex = i - 1;  
                    break;
                }
            }
            
            HashMap<Integer,Integer> hm = new HashMap<>();
            ArrayList<Integer> arraylist = new ArrayList<>();
            for(int i = pivotIndex; i < arr.length; i++){ 
                if(i > pivotIndex){
                    arraylist.add(arr[i]);
                }
                if(i + 1 < arr.length && arr[i + 1] > arr[i]){  
                    hm.put(arr[i + 1], arr[i + 1] - arr[i]);
                }
            }
            int Min = Integer.MAX_VALUE;
            int toSwap = 0;
            for(int key: hm.keySet()){ 
                if(hm.get(key) < Min){
                    Min = hm.get(key); 
                    toSwap = key;
                }
            }
            int toSwapIndex = findIndex(arr,toSwap);
            int temp = arr[pivotIndex];
            arr[pivotIndex] = arr[toSwapIndex];
            arr[toSwapIndex] = temp;
            Collections.reverse(arraylist);
            int index = 0;
            for(int i = pivotIndex + 1; i < arr.length && index < arraylist.size(); i++){  
                arr[i] = arraylist.get(index++);
            }
            
            for(int i = 0; i < size; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
}