import java.util.Scanner;

public class OMGIhateIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inp = scanner.nextLine().toLowerCase();  
        char cha = scanner.nextLine().toLowerCase().charAt(0); 

        int numOfEq = 0;
        StringBuilder indices = new StringBuilder();

        
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == cha) {
                numOfEq++;
                indices.append(i).append(", ");
            }
        }

        if (numOfEq > 0) {
           
            if (indices.length() > 0) {
                indices.setLength(indices.length() - 2);
            }
            System.out.println(numOfEq);  
            System.out.println(indices.toString());  
        } else {
            System.out.println("ERROR");
        }
    }
}
