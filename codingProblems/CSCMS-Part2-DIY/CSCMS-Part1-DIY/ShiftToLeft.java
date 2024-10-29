import java.util.*;
public class ShiftToLeft{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int[] arr = new int[amount];
        for(int i = -1; i < amount - 1 ; i++){
            if(i == -1){
            arr[amount - 1] = scanner.nextInt();
            }else{
                arr[i] = scanner.nextInt();
            }
        }
        String output = "";
        for(int x: arr){
            output += x + " ";
        }
        System.out.print(output);
    }
}