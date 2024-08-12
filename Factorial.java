import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long fac = scanner.nextInt();
        long counter = 1;
        for(int i = 1;i < fac+1; i++){
            
            
            counter *= i;
            
            
        }
        System.out.println(counter);
        scanner.close();
    }
}