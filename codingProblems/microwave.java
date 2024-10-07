/**
 * microwave
 */
import java.util.*;

public class microwave {

    public static void main(String[] args) {
        int counter = 0;
        int counter2 = 0;
        int[][] x = new int[3][3];
        int[] fin = new int[3*3];
        // Initialize the array with counter values
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                x[i][j] = counter++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fin[counter2++] = x[i][j];
            }
        }
        
        // Print the 2D array in a readable format
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();  // Move to the next line after each row
        }
        System.out.println(Arrays.toString(fin));
    }
}
