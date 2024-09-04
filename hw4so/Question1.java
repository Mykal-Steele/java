import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPerson = scanner.next(); // Read the first person as a String
        String secondPerson = firstPerson.equals("A") ? "B" : "A";
        int totalCoal = scanner.nextInt(); 
        int round = 0;
        int coalInCurrentRound = 0;
        int i = 1;



        // Calculate the round number 
        while (coalInCurrentRound < totalCoal) {
            coalInCurrentRound = (i * i) + i; // Compute the number of drinks in the current round
            i++;
        }

        round = i - 1;  



        
        int coalThreshold1 = round * round;
        int coalThreshold2 = coalThreshold1 + round;

        if (totalCoal <= Math.pow(round,2)) {
            System.out.println(firstPerson);
        } else if (totalCoal <= coalThreshold2) {
            System.out.println(secondPerson);
        }
    }
}
