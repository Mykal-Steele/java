    import java.util.Scanner;
    public class Full180Rotation{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();
            int[][] arr = new int[rows][cols];
            for(int i = rows - 1; i >=0;i--){
                for(int j =cols -1 ; j>=0;j--){
                    arr[i][j] = scanner.nextInt();
                }
            }
            for(int i = 0; i < rows;i++){
                for(int j = 0; j < cols; j++){
                    System.out.print(arr[i][j] + " ");
                }System.out.println();
            }
        }
    }