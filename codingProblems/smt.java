/**
 * smt
 */
import java.util.Arrays;
import java.util.Scanner;
public class smt {

    public static void rev1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int len = inp.length();
        String output = "";
        for (int i = len - 1; i >= 0; i--) {
            output += inp.charAt(i);
        }
        System.out.println(output);
    }
    public static String revToReuse(String args) {
        
        int len = args.length();
        String output = "";
        for (int i = len - 1; i >= 0; i--) {
            output += args.charAt(i);
        }
        return output;
    }

    public static void toUpper3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().toUpperCase();
        System.out.println(inp);
    }

    public static void toLower4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().toLowerCase();
        System.out.println(inp);
    }

    public static void sm5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String ii = scanner.nextLine();
        boolean t = inp.contains(ii);
        System.out.println(t);
    }

    public static void charCount11(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        char charToCheck = scanner.nextLine().charAt(0);
        int counter = 0;
        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if (ch == charToCheck) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void replaceString12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String toReplace = scanner.nextLine();
        String replaceWith = scanner.nextLine();

        String output = inp.replace(toReplace, replaceWith);

        System.out.println(output);
    }

    public static void lastIndex7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String str = scanner.nextLine();
        int lastInd = inp.lastIndexOf(str);
        System.out.println(lastInd);
    }

    public static void last25(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String news = inp.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(news);
    }

    public static void print24(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int len = scanner.nextInt();
        int counter = 0;
        String output = "";
        for (int i = 0; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if (ch != ' ') {
                counter++;
                output += ch;
                if ((counter == len) && (i + 1 < inp.length() && inp.charAt(i + 1) == ' ')) {
                    System.out.println(output);
                }
            } else {
                counter = 0;
                output = "";
            }
        }
    }
    public static void numToSmt23(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inp = scanner.nextLine();       
        String replaceWith = scanner.nextLine(); 
        
        String output = inp.replaceAll("\\d+", replaceWith);
        
        System.out.println(output); 
    }
    public static void join14(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfFruits = scanner.nextInt();
        scanner.nextLine();
        String[] fruits = new String[numberOfFruits];

        for (int i = 0; i < numberOfFruits; i++) {
            fruits[i] = scanner.nextLine();
        }
        String separator = ",";
        String result = String.join(separator, fruits);
        System.out.println(result); 
    }

    
    public static void incWhite15(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        boolean includeWhi = inp.contains(" ");
        System.out.println(includeWhi);
    }
    public static void rmAllDigit16(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String output = inp.replaceAll("\\d+", "");
        System.out.println(output);
    }
    public static void capital19(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] sp = inp.split("[\\s+]");
        String output = "";
        for (String word : sp) {
            
            output += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
           
        }
        System.out.println(output.trim());

        }
        

    public static void odd(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter = 0;
        int sum = 0;
            for(int i =0; counter < num; i++){
                if(i % 2 != 0){
                    System.out.println(i);
                    sum+=i;
                    counter++;
                }
            }
            System.out.println(sum);
            
        
    }

    public static void rever(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String rever = revToReuse(inp);
        System.out.println(rever);
        if(inp.equals(rever)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


    public static void sp21(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String output = "";
        if (inp.length() > 0) {
            output += inp.charAt(0); 
        }
        for (int i = 1; i < inp.length(); i++) {
            char ch = inp.charAt(i);
            if (ch != inp.charAt(i - 1)) {
                output += ch;
            }
        }
        System.out.println(output);
    }
    public static void q22(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String replaceWith = scanner.nextLine();
        String output = "";
        for(int i = 0; i<inp.length();i++){
             char ch = inp.charAt(i);
             

        }
    }



    public static void main(String[] args) {
        
    }

}
