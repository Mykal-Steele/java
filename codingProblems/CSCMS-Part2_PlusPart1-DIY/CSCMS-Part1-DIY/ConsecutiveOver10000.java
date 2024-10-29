import java.util.Scanner;
public class ConsecutiveOver10000{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] days = new int[n];
        
        for(int i = 0; i < n; i++){
            days[i] = scanner.nextInt();
        }
        
        int counter = 0;
        int l = 0;
        
        for(int i = 0; i < n; i++){
            if(days[i] > 10000){
                l++;
                counter = Math.max(counter,l);
            }else{
                l = 0;
            }
        }
        
        System.out.println(counter + (counter <= 1 ? " day" : " days"));
    }
}