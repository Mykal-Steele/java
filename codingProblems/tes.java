import java.util.Scanner;

public class tes {

    public static String revToReuse(String str) {
        int len = str.length();
        String output = "";
        for (int i = len - 1; i >= 0; i--) {
            output += str.charAt(i);
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = scanner.nextInt();
        scanner.nextLine();
        String[] sp = new String[counter];
        for(int i = 0; i<counter; i++)
        {
            sp[i] = scanner.nextLine().toLowerCase(); 
        }
        

        String output = "";
        for (String word : sp) {
            word = revToReuse(word);
            output += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }

        System.out.println(output.trim());
        scanner.close();  // Close the scanner
    }
}
