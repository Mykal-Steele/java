/**
 * PackCod class demonstrates various string manipulation and utility methods.
 */
import java.util.*;

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
        scanner.close();  
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
        scanner.close();  
    }

    
    public static void replaceFirst22(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String toReplace = scanner.nextLine();
        String replaceWith = scanner.nextLine();
        String ne = inp.replaceFirst(toReplace, replaceWith);
        System.out.println(ne);
        scanner.close();  // Close the scanner
    }



    


   
        public static void ww(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            
            // Determine which number is greater
            int greater = Math.max(start, end);
            int smaller = Math.min(start, end);
            
            // Print the sequence
            for (int i = greater; i >= smaller; i--) {
                for (int j = greater; j >= smaller; j--) {
                    if (j >= i) {
                        System.out.print(j + " ");
                    }
                }
            }
            
            // Close the scanner
            scanner.close();
        }
    
        public static void minToDay(String[] args){
            Scanner scanner = new Scanner(System.in);
            int min = scanner.nextInt();
            
            int day = min / 1440;
            int year = day /365;
            int las = day % 365;
            System.out.println(year+" " + las);
            
        }
        public static void reverseString(String args[]){
            Scanner scanner = new Scanner(System.in);
            int len = 3;
            String[] inp = new String[len];


        }
        
        public static void uwu(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine().toLowerCase();
            String[] sp = inp.split("[\\s+]");
            
            String output = "";
            for (String word : sp) {
                word = revToReuse(word);
                output += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                
            }
            System.out.println(output.trim());
            scanner.close();  // Close the scanner
        }
        public static void classGroup(String[] args){
            
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            int[] ar = new int[size];
            for(int i = 0; i<size; i++){
                ar[i] = scanner.nextInt();
            }
            int smallest = ar[1];
            for(int i : ar){
                if(i< smallest){
                    i = smallest;
                }
            }
            System.out.println();
        }
        public static void duplicate(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            String[] ar = new String[size];
            String emp = "";
    
            for (int i = 0; i < size; i++) {
                ar[i] = scanner.next();
            }
    
            for (String str : ar) {
                for (char ch : str.toCharArray()) {
                    if (emp.indexOf(ch) == -1) {
                        emp += ch;
                    }
                }
            }
    
            System.out.println(emp);
        }

        public static void decry(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine();
    
            int[] tempArr = new int[inp.length()];
            int arrIndex = 0;
    
            int currentNumber = 0;
            boolean hasDigits = false;
    
            for (int i = 0; i < inp.length(); i++) {
                char ch = inp.charAt(i);
    
                if (ch >= 'a' && ch <= 'z') {
                    if (hasDigits) {
                        tempArr[arrIndex++] = currentNumber;
                        currentNumber = 0;
                        hasDigits = false;
                    }
                    tempArr[arrIndex++] = ch - 'a' + 1;
                } else if (Character.isDigit(ch)) {
                    currentNumber = currentNumber * 10 + (ch - '0');
                    hasDigits = true;
                } else {
                    if (hasDigits) {
                        tempArr[arrIndex++] = currentNumber;
                        currentNumber = 0;
                        hasDigits = false;
                    }
                    tempArr[arrIndex++] = ch;
                }
            }
    
            if (hasDigits) {
                tempArr[arrIndex++] = currentNumber;
            }
    
            int[] arr = Arrays.copyOf(tempArr, arrIndex);
            int cum = Arrays.stream(arr).sum();
            
            
    
            // Find unique prime factors of the cumulative sum
            int uniquePrimeSum = sumUniquePrimeFactors(cum);
            System.out.println(uniquePrimeSum);
        }
    
        // Method to find the sum of unique prime factors
        public static int sumUniquePrimeFactors(int n) {
            Set<Integer> uniqueFactors = new HashSet<>();
    
            // Divide n by 2 to get all 2s as factors
            while (n % 2 == 0) {
                uniqueFactors.add(2);
                n /= 2;
            }
    
            // n must be odd at this point, so we can skip even numbers
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                while (n % i == 0) {
                    uniqueFactors.add(i);
                    n /= i;
                }
            }
    
            // If n is still greater than 2, then n itself is a prime number
            if (n > 2) {
                uniqueFactors.add(n);
            }
    
            // Sum up the unique prime factors
            int sum = 0;
            for (int factor : uniqueFactors) {
                sum += factor;
            }
    
            return sum;
        }
    public static void main(String[] args) {
        decry(args);
    }
}
