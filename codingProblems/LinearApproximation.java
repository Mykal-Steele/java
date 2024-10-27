import java.util.Scanner;


public class LinearApproximation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a value for x: ");
        double x = scanner.nextDouble();
        
        
        double a = Math.ceil(x);
        
        
        while (Math.sqrt(a) % 1 != 0) {
            a++;
        }
       
        double fa = Math.sqrt(a);
        double derivativeFa = 1 / (2 * Math.sqrt(a));
        double Lx = fa + derivativeFa * (x - a);   
        System.out.println("The linear approximation of Square Root of " + x + " is: " + Lx);
        scanner.close();

    }
}
