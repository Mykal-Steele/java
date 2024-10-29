import java.util.Scanner;
import java.util.Arrays;


public class MinAddPlusMaxAdd{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i =0; i< 5;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        int minSum = 0;
        int maxSum = 0;
        
        for(int i = 0; i<4;i++){
            minSum+=arr[i];
        }
        for(int i = 4; i>0; i--){
            maxSum+=arr[i];
        }
        System.out.print(minSum + " " + maxSum);
    }
}