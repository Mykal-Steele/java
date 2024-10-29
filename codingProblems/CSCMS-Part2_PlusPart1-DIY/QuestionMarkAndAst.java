import java.util.Scanner;
import java.util.HashSet;

public class QuestionMarkAndAst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fir = scanner.nextLine();
        String sec = scanner.nextLine();
        boolean match = false;
        
        if (!sec.contains("*") && !sec.contains("?")) {
            match = fir.equals(sec);
        }
        
        else if (!sec.matches(".*[a-zA-Z].*")) {
            match = true;
        }
        
        else if (sec.contains("*")) {
            HashSet<String> firSet = new HashSet<>();
            for (String x : fir.split("")) {
                firSet.add(x);
            }
            if (firSet.size() < 1 && firSet.contains(sec)) {
                match = true;
            }
        }
        
        else if (sec.contains("?")) {
            String temp = sec.replaceAll("\\?", "");
            match = fir.contains(temp);
        }

        System.out.print(match);
    }
}
