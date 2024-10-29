import java.util.Scanner;
public class DifferenceBetSumOfDiagonal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        int main = 0;
        for(int i = 0 ; i < n; i++){
            main += arr[i][i];
        }
        int notMain = 0;
        int index = 0;
        for(int i = n -1; i >= 0; i--){
            notMain += arr[index][i];
            index++;
        }
        System.out.print(Math.abs(main - notMain));
    }
}
        