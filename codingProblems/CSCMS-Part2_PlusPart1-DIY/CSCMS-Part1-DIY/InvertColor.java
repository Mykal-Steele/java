import java.util.Scanner;
public class InvertColor{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = scanner.nextInt();
                arr[i][j] = Math.abs(255 - arr[i][j]);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}