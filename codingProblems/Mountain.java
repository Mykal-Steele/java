import java.util.Scanner;

public class Mountain {
    public static void main(String[] args) {
       
        int[] occurrences = new int[101];  
        
    
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int number = scanner.nextInt();
            
         
            if (number == 0) {
                break;
            }
            if (number >= 1 && number <= 100) {
                occurrences[number]++;
            }
        }
        

        for (int i = 1; i < occurrences.length; i++) {
            if (occurrences[i] > 0) {
                System.out.println(i + " occurs " + occurrences[i] + " " + (occurrences[i] > 1 ? "times" : "time"));
            }
        }
        scanner.close();
    }
}
