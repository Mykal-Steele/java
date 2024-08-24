/**
 * PackCod class demonstrates various string manipulation and utility methods.
 */
import java.util.Scanner;

public class PackCod {
    //{1, 3, 4, 5, 7, 11, 12, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25}

    // Method to remove all digits, lowercase letters, and spaces from the input string.
    public static void dgrm(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String dr = inp.replaceAll("[\\d+a-z ]", "");
        System.out.println(dr);
        scanner.close();  // Close the scanner
    }

    // Method to reverse the input string and print it.
    public static void rev1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int len = inp.length();
        String output = "";
        for (int i = len - 1; i >= 0; i--) {
            output += inp.charAt(i);
        }
        System.out.println(output);
        scanner.close();  // Close the scanner
    }
    public static void rever20(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String rever = revToReuse(inp);
        System.out.println(rever);
        if (inp.equals(rever)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        scanner.close();  // Close the scanner
    }

    // Method to reverse a string and return the reversed string.
    public static String revToReuse(String args) {
        int len = args.length();
        String output = "";
        for (int i = len - 1; i >= 0; i--) {
            output += args.charAt(i);
        }
        return output;
    }

    // Method to convert input string to uppercase and print it.
    public static void toUpper3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().toUpperCase();
        System.out.println(inp);
        scanner.close();  // Close the scanner
    }

    // Method to convert input string to lowercase and print it.
    public static void toLower4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().toLowerCase();
        System.out.println(inp);
        scanner.close();  // Close the scanner
    }

    // Method to check if a substring is present in the input string and print the result.
    public static void sm5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String ii = scanner.nextLine();
        boolean t = inp.contains(ii);
        System.out.println(t);
        scanner.close();  // Close the scanner
    }

    // Method to count the occurrences of a specific character in the input string and print the count.
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
        scanner.close();  // Close the scanner
    }

    // Method to replace a substring in the input string with another substring and print the result.
    public static void replaceString12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String toReplace = scanner.nextLine();
        String replaceWith = scanner.nextLine();
        String output = inp.replace(toReplace, replaceWith);
        System.out.println(output);
        scanner.close();  // Close the scanner
    }

    // Method to find the last index of a substring in the input string and print the index.
    public static void lastIndex7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String str = scanner.nextLine();
        int lastInd = inp.lastIndexOf(str);
        System.out.println(lastInd);
        scanner.close();  // Close the scanner
    }

    // Method to remove all non-alphanumeric characters from the input string and print the result.
    public static void last25(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String news = inp.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(news);
        scanner.close();  // Close the scanner
    }

    // Method to print each word of the input string if the word's length matches a given length.
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
        scanner.close();  // Close the scanner
    }

    // Method to replace all digits in the input string with a specified string and print the result.
    public static void numToSmt23(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();       
        String replaceWith = scanner.nextLine(); 
        String output = inp.replaceAll("\\d+", replaceWith);
        System.out.println(output); 
        scanner.close();  // Close the scanner
    }

    // Method to join an array of strings with a comma and print the result.
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
        scanner.close();  // Close the scanner
    }

    // Method to check if the input string contains any whitespace and print the result.
    public static void incWhite15(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        boolean includeWhi = inp.contains(" ");
        System.out.println(includeWhi);
        scanner.close();  // Close the scanner
    }

    // Method to remove all digits from the input string and print the result.
    public static void rmAllDigit16(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String output = inp.replaceAll("\\d+", "");
        System.out.println(output);
        scanner.close();  // Close the scanner
    }

    // Method to capitalize the first letter of each word in the input string and print the result.
    public static void capital19(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] sp = inp.split("[\\s+]");
        String output = "";
        for (String word : sp) {
            output += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(output.trim());
        scanner.close();  // Close the scanner
    }

    // Method to print the first n odd numbers and their sum.
    public static void odd(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter = 0;
        int sum = 0;
        for (int i = 0; counter < num; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                sum += i;
                counter++;
            }
        }
        System.out.println(sum);
        scanner.close();  // Close the scanner
    }

    // Method to check if the input string is a palindrome by comparing it to its reversed version.
    

    // Method to remove consecutive duplicate characters from the input string and print the result.
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
        scanner.close();  // Close the scanner
    }

    // Method to replace the first occurrence of a substring in the input string and print the result.
    public static void replaceFirst22(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String toReplace = scanner.nextLine();
        String replaceWith = scanner.nextLine();
        String ne = inp.replaceFirst(toReplace, replaceWith);
        System.out.println(ne);
        scanner.close();  // Close the scanner
    }

    public static void main(String[] args) {
        
    }
}