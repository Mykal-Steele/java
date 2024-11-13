package Recursion_Formatting_ArrayList_HashMap_Practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class arliSort{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arlist = new ArrayList<>();
        int inp = 0;
        while (true) {
        inp = scanner.nextInt();
        if(inp == -1){
            break;
        }
        arlist.add(inp);

        }
 
        Collections.sort(arlist);
        for(int i: arlist){
            System.out.print(i+ " ");
        }
        System.out.println();
        Collections.reverse(arlist);
        for(int i: arlist){
            System.out.print(i + " ");
        }
    }
}
