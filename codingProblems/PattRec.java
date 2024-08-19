import java.util.Scanner;

/**
 * PattRec
 */
public class PattRec {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        char recS = '*';
        char otS = '-';
        int idk = 1;
        for (int i = 0; i < size - idk; i++) {
            System.out.print(otS);
            
        }
        idk++;
        for (int i = 0; i < size; i++) {
            System.out.print(recS);
        }
        System.out.println();
        for (int i = 0; i < size - idk; i++) {
            System.out.print(otS);   
        }
        System.out.println(recS);
        idk++;
        
        
        scanner.close(); 
    }
}
