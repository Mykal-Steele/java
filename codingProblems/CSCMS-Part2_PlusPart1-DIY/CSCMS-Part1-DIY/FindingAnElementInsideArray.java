import java.util.*;
public class FindingAnElementInsideArray{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inp = "";
        inp = scanner.nextLine();
        String[] x = inp.split(" ");
        int rows = Integer.valueOf(x[0]);
        int cols = Integer.valueOf(x[1]);
        int toSearch = Integer.valueOf(x[2]);
        int[][] given = new int[rows][cols];
        boolean isFound = false;
        String output = "Indices of number " + toSearch + ": ";
        
        for(int i = 0; i < rows; i ++){
            for(int j = 0; j < cols; j++){
                given[i][j] = scanner.nextInt();
                if(given[i][j] == toSearch){
                    output += "("+i+","+j+") ";
                    isFound = true;
                }
            }
        }
        if(isFound){
            System.out.print(output);
        }else{
        System.out.print("There is no number " + toSearch + " in the matrix.");
        }
    }
}