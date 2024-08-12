import java.util.Scanner;

/**
 * RecButMoreCus
 */
public class RecButMoreCus {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        int firstValue = Integer.parseInt(parts[0]);
        int secondValue = Integer.parseInt(parts[1]);
        char symbol = '*';
        String line = "";
        for(int i = 0; i < secondValue; i++){
            line += symbol;
        }
        for(int i = 0;i < firstValue; i++){
            System.out.println(line);
        }
        scanner.close();
    }
}