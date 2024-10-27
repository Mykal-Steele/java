import java.util.Arrays;

public class Weird {
    public static void main(String[] args) {
        int[][] xy = generateSpiralPattern(5);
        
        // Print the spiral pattern
        for (int[] row : xy) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] generateSpiralPattern(int n) {
        int[][] output = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int value = 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                output[top][i] = value++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                output[i][right] = value++;
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    output[bottom][i] = value++;
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    output[i][left] = value++;
                }
                left++;
            }
        }
        return output;
    }
}
