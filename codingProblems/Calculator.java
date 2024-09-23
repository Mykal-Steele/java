/**
 * Calculator
 */
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        int sec = scanner.nextInt();
        
            switch (operator) {
            case '+':
                System.out.println(first + sec);
                break;
        
            case '-':
                System.out.println(first - sec);
                break;
            
            case '/':
            if(sec != 0)
                {System.out.println(first / sec);}
                break;
            case '*':
                System.out.println(first * sec);
                break;
            case '%':
                System.out.println(first % sec);
                break;
            default:
            System.out.println("error");
            break;
            }
    }
}