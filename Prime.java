import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        
        if (inp == 1) {
            System.out.println("No");
        } else {
            int sqru = (int)Math.sqrt(inp);
            boolean isPrime = true;
            for(int i = 2; i <= sqru; i++) {
                if(inp % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}
