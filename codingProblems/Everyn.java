/**
 * Everyn
 */
import java.util.Scanner;
public class Everyn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int index = scanner.nextInt();
        String output = "";
        for(int i = 0; i< inp.length();i += index){
            char ch = inp.charAt(i);
            output += ch;


        }
        System.out.println(output);
    }
}