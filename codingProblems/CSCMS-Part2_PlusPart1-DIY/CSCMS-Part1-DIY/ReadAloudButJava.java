import java.util.Scanner;
public class ReadAloudButJava{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        String inps = scanner.nextLine();
        char[] inp = inps.toCharArray();
        char cur = inp[0];
        int counter = 1;
        String output = inp[0] + "";
        
        for(int i=1; i<inp.length; i++){
            if(cur == inp[i]){
                counter++;
            } else {
                output += counter;
                counter = 1;
                cur = inp[i];
                output += cur;
            }
        }
        
        output += counter;
        
        if(output.length() >= inps.length()){
            System.out.print(inps);
        } else {
            System.out.print(output);
        }
    }
}
