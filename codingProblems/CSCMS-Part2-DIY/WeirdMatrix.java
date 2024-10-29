import java.util.Scanner;
import java.util.Arrays;
public class WeirdMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        boolean goingLeft = true;
        int counter = 1;
        int[][] output = new int[rows][cols];
        for (int j = 0; j < cols; j++) {
            output[0][j] = counter;
            counter++;
        }
        for (int i = 1; i < rows; i++) {
            output[i][cols - 1] = counter;
            counter++;
        }
        for (int i = rows - 1; i > 0; i--) {
            int start = goingLeft ? cols - 2 : 0;
            int end = goingLeft ? -1 : cols - 1;
            int step = goingLeft ? -1 : 1;
            for (int j = start; j != end; j += step) {
                output[i][j] = counter++;
            }
            goingLeft = !goingLeft;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}