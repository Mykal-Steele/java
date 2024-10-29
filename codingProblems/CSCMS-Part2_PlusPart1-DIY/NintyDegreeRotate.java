import java.util.Scanner;
public class NintyDegreeRotate{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for(int j = size -1;  j >= 0; j--)
        {
            for(int i = 0; i < size;i++){
            arr[i][j] = scanner.nextInt();
            }
            
        }
        for(int i = 0; i < size; i++){
            for(int j =0; j < size; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}