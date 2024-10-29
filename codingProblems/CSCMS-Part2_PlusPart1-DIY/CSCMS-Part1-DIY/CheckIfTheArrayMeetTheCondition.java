import java.util.Scanner;
public class CheckIfTheArrayMeetTheCondition{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        boolean valid = true;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i + 1 < rows && arr[i][j] != arr[i + 1][j]) {
                    valid = false;
                }
                if (j + 1 < cols && arr[i][j] == arr[i][j + 1]) {
                    valid = false;
                }
            }
        }

        System.out.print(valid);
    }
}