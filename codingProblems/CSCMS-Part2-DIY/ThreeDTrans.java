import java.util.Scanner;

public class ThreeDTrans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int[][][] arr = new int[x][y][z];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }

        int[][][] output = new int[y][z][x];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    output[j][k][i] = arr[i][j][k];
                }
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < z; j++) {
                for (int k = 0; k < x; k++) {
                    System.out.print(output[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }
}
