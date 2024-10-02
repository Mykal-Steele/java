import java.util.*;
public class wad{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double[][] first = new double[3][3];
        double[][] sec = new double[3][3];
        
        for(int i = 0; i< 3;i++){
            for(int j = 0; j< 3;j++){
                first[i][j] = scanner.nextDouble();
            }
        }
        for(int i = 0; i< 3;i++){
            for(int j = 0; j< 3;j++){
                sec[j][i] = scanner.nextDouble();
                }
        }
        
        int counter = 0;
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(sec));
       
    }
}

// 0 0 + 0 0
// 0 1 + 0 1
// 1 0  + 0 1
// 1 1 + 1 1