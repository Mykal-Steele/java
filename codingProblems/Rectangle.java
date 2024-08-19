import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args) {
        char symbol = '*';
        String line = "";
        
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for(int i = 0; i < size; i++){
            line += symbol;
        }
        for(int i = 0;i < size; i++){
            System.out.println(line);
        }
        scanner.close();
    }
}