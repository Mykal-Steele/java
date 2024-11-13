import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class rando{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arlist = new ArrayList<>();
        int inp = 0;
        while (inp != -1) {
        inp = scanner.nextInt();
        arlist.add(inp);

        }
        Collections.sort(arlist);
        for(int i: arlist){
            System.out.print(i+ " ");
        }
        Collections.reverse(arlist);
        for(int i: arlist){
            System.out.println(i + " ");
        }
    }
}
