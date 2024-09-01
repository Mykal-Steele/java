import java.util.Scanner;

public class testte {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        for (char ch : st.toLowerCase().toCharArray()){
            System.out.println(ch);
        }
}
}
