import java.util.*;
public class CocacolaDrinksFirst{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            String startsFirst = scanner.next(); 
            
            String startsSecond = startsFirst.equals("A") ? "B" : "A";
            int amountOfCoal = scanner.nextInt(); 
            int round = 0;
            int i = 1;
            int ran = 0;
        
            while (ran < amountOfCoal) {
                ran = (i * i) + i; // Calculate the number of drinks in the current round
                i++;
            }
        
            round = i - 1;    
            int ms = round * round;
            int ms2 = ms + round;
            
            if (amountOfCoal <= ms) {
                if (startsFirst.equals("A")) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            } else if (amountOfCoal <= ms2) {
                if (startsSecond.equals("B")) {
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }
            }
            scanner.close();
        }
}