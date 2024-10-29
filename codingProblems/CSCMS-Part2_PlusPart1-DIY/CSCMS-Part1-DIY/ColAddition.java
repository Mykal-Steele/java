import java.util.Scanner;
public class ColAddition{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int x = 0;
        for(int i = 0 ; i < cols; i++){
            for(int j = 0; j < rows; j++){
                x+=arr[j][i];
            }
            System.out.println(x);
            x = 0;
        }
    }
}