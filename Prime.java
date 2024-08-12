import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        int current = inp;
        
        int sqru = (int)Math.sqrt(inp);
        boolean isPrime = true;
        for(int i = 2; i <= sqru; i++)
        {

            System.out.println(inp +" % "+ i);
            int test = inp % i; 
            System.out.println("This is the number after dividing - "+test);
            if(test == 0){
                System.out.println("EFFFFFFFFFf");
                isPrime = false;
                break;
                
            }        
        }
        if(isPrime == true)
        {
            System.out.println("The number " + current + " is Prime.");
        }else{
            System.out.println("not Prime");
        }
        scanner.close();
    }
}