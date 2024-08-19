import java.util.Scanner;

public class FrickingFacAgainOMGGG{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int a = 0;
        int b = 1;
        String output  = "";
        scanner.close();
        if(len >0){

            output += "0 ";

        }
        if(len > 1)
        {
            output += "1 ";
        }
        if(len > 2)
        {for(int i = 2; i < len; i++){
            int result = a + b;
            a = b;
            b = result; 
            if(i < len - 1)
            {output += result + " ";}else{
                output += result;
            }
            
        }}
        
        System.out.println(output);
    }
}