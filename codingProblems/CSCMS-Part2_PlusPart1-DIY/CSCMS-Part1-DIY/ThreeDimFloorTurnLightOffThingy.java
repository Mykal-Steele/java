import java.util.Scanner;

public class ThreeDimFloorTurnLightOffThingy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int F = scanner.nextInt(); 
        int R = scanner.nextInt(); 
        int Z = scanner.nextInt();
        
        
        int[][][] arr = new int[F][R][Z];

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < R; j++) {
                for (int k = 0; k < Z; k++) {
                    arr[i][j][k] = scanner.nextInt();
                }
            }
        }
        
        int floorToKill = scanner.nextInt() -1;
        for (int j = 0; j < R; j++) {
            for (int k = 0; k < Z; k++) {
                arr[floorToKill][j][k] = 0;
            }
        }
        int countOfOnes = 0;
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < R; j++) {
                for (int k = 0; k < Z; k++) {
                    if (arr[i][j][k] == 1) {
                        countOfOnes++;
                    }
                }
            }
        }
        

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < R; j++) {
                for (int k = 0; k < Z; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println(); 
        }
        System.out.print("Total Lights On: "+countOfOnes);
    }
}
