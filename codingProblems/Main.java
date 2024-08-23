import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String reversed = new StringBuilder(inp).reverse().toString();
        String outputI = "";
        String outputR = "";
        System.out.println(reversed);
        for(int i = 0; i<inp.length();i++){
        char inC = inp.charAt(i);
        System.out.println(inC + " II");
        
        outputI += inC + " ";
        
        }
        for(int i = 0; i<reversed.length();i++){
            char reC = reversed.charAt(i);
            System.out.println(reC + " RR");
            outputR += reC + " ";
        }
        System.out.println(outputI+ " || " + outputR);
        String fin = outputI.replace(outputR, "");
        System.out.println("THIS IS " + fin);
    }
}