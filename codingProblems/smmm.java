import java.util.Scanner;

public class smmm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputDate = scanner.nextLine();
        String out = "";

        String[] x = inputDate.split("-");
        for (String y : x) {
            int value = Integer.parseInt(y);
            String binary = Integer.toBinaryString(value);
            out += binary + "-";
            
        }
        String output = out.substring(0,out.length()-2);
        System.out.println(output);
    }
}
class Solution{
    public int numIdenticalPairs(int[]nums){
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
