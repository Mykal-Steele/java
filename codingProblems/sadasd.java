import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sadasd {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = Integer.toString(n);
        int count = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '8') {
                if (i > 0 && numStr.charAt(i - 1) == '8') {
                    count += 2; // Double count if previous character was also '8'
                } else {
                    count += 1;
                }
            }
        }
    }
}
