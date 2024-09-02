/**
 * PackCod class demonstrates various string manipulation and utility methods.
 */
import java.util.*;

public class PackCod {
    //{1, 3, 4, 5, 7, 11, 12, 14, 15, 16, 19, 20, 21, 22, 23, 24, 25}
    public static void laptopDestroyer(String[] args) {
        while(true){
            for(int i = 0; true; i++)
            
            {System.out.println(i*2/Math.PI);}
        }
    }
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
    public static String removeEverySecondChar(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) // i = 1 if you want odd num
        {
            result.append(input.charAt(i));
        }
        return result.toString();
    }
    public static String[] stringSplitByEachCharToArrays(String input) {
        String[] output = new String[input.length()];
        for (int i = 0; i < input.length(); i++) {
            char cur = input.charAt(i);
            output[i] = String.valueOf(cur);  
        }
        return output;  
    }
    public static String arrayToString(String[] input){
        String output= "";
        for(int i = 0; i<input.length;i++){
            output += input[i];
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
        public static int reverseInt(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String out = scanner.nextLine();
            String withneg = "-";
            if(!out.substring(0,1).equals("-")){
                String rev = revToReuse(out);
                
                return Integer.parseInt(rev);
            }else{
                withneg += revToReuse(out);
                return Integer.parseInt(withneg.substring(0, withneg.length()-1));
            }
            
        }
            public static void bacteria(String[] args){
                Scanner scanner = new Scanner(System.in);
                int amout = scanner.nextInt();
                int counter = 0;
                
                while(amout > 0)
                    {if(amout %2 != 0){
                        counter++;
                        amout--;
                        amout /= 2;
                    }else if(amout % 2 == 0){
                        amout /= 2;
                    }}
                    System.out.println(counter);

                    
                }
        public static void stringToInt(String[] args){
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine().toLowerCase().trim();
            inp = inp.replaceAll(" ", "");
            inp = inp.replaceAll("[^0-9]", "");
            int output = Integer.parseInt(inp);
            System.out.println(output);


        }       
        // public static void regularExpressionMatching(String[] args){
        //     Scanner scanner = new Scanner(System.in);
        //     String inp = scanner.nextLine();
        //     String chec = scanner.nextLine();
        //     boolean output = false;
        //     if(chec.substring(chec.length()-2) == ".*"){
        //         if(chec.substring(0, chec.length()-2).equals(inp)){
        //             output = true;
        //         }

        //     }
        //     System.out.println(output);
        // }
        // NO

        public static void romanToInt(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int inp = scanner.nextInt();
            char oneSym = 'I';
            char fiveSym = 'V';
            char tenSym = 'X';
            char fiftySym = 'L';
            char oneHunSym = 'C';
            char fiveHunSym = 'D';
            char oneThoSym = 'M';
            String output = "";
            
            
            if(inp > 1000){
                
                int mDigit = inp /1000;  
                int  dDigit = mDigit/500;

            }
            
        }




        
        public static void xPattern(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            String inp = scanner.nextLine();
            int size = inp.length();
            String[][] row = new String[size][size];
            
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    row[i][j] = " ";
                }
            }
            for (int i = 0; i < size; i++) {
                char cur = inp.charAt(i);
                row[i][i] = String.valueOf(cur);
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(row[i][j]);
                    System.out.print(row[i][size-j-1]);
                }
                System.out.println(); 
            }
            // for (int i = 0; i < size; i++) {
            //     for (int j = 0; j < size; j++) {
            //         System.out.print(row[i][size-j-1]);
            //     }
            //     System.out.println(); 
            // }

            
            
        }











        public static void multipleToOne(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine();
            inp = inp.replaceAll("[?]+","?");
            inp = inp.replaceAll("[!]+", "!");
            System.out.println(inp);
            // for(int i = 0; i < inp.length(); i++){
            //     char cur = inp.charAt(i);
            //     if((cur == '!') ||( cur == '?')){
                    
            //         break;
            //     }
            // }
        }
        public static void sameCatand(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine();
            String output = "";
            int catCounter = 0;
            int mouseCounter = 0;
            int normalCounter = 0;
            for(int i = 0; i <inp.length(); i++){
                char cur = inp.charAt(i);
                output += cur;
                normalCounter++;
                if((normalCounter > 2) && ((!output.equals("cat")) || (!output.equals("mou")))){
                    output = "";
                    normalCounter = 0;
                }
                System.out.println(output + "WFW");
                if(output.equals("cat")){
                    catCounter++;
                    output = "";
                }
                else if(output.equals("mouse")){
                    mouseCounter++;
                    output = "";
                }

            }
            System.out.println(mouseCounter + " This is howmany mouse");
            System.out.println(catCounter + " This is howmany cat");
        }
        public static void rec(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            
            int size = scanner.nextInt();
            char star = '*';
            char dash = '-';
            String m = "";
            String[][] row = new String[size][size];
            for(int i = 0; i< size; i++)
            {
                m += star;
                
            }
            
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    row[0][j] = "*";
                    row[i][j] = "-";
                    
                    
                }
            }
            for (int i = 0; i < size; i++) {
                
                row[i][i] = String.valueOf(star);
                
            }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(row[i][j]);
                    System.out.print(row[i][size-j-1]);
                }
                System.out.println(); 
            
            }
            
            // for (int i = 0; i < size; i++) {
            //     for (int j = 0; j < size; j++) {
            //         System.out.print(row[i][size-j-1]);
            //     }
            //     System.out.println(); 
            // }

            
            
        }
        public static void ef(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine();    
            
            System.out.println(inp.split("cat", -1).length==inp.split("mouse", -1).length);
        }
        public static void mDuplicate(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine();
            int counter = 0;
            String output = "";
            
            for(int i = 0; i<inp.length(); i++){
                char cur = inp.charAt(i);
                for(int j = 0; j<inp.length(); j++){
                    ;
                }


            }
        }


        public static void test(String[] args) {
            
            Scanner scanner = new Scanner(System.in);

            
            String x = scanner.nextLine();
            long tim = System.currentTimeMillis();
            String newx = revToReuse(x );
            System.out.println(newx+ "Time: " + (System.currentTimeMillis() - tim));
            
            StringBuffer xb = new StringBuffer(scanner.nextLine());
            tim = System.currentTimeMillis();
            xb.reverse();
            System.out.println(xb + "Time: " + (System.currentTimeMillis() - tim));
        }



        public static void smte(String[] args) {      
        Scanner scanner  = new Scanner(System.in);
        
        String str = scanner.nextLine();

        char[] split = str.toCharArray();
        System.out.println(Arrays.toString(split));
        }
        public static void printDiagonal(String input) {
            for (int i = 0; i < input.length(); i++) {
                // Print spaces before the character
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                // Print the character
                System.out.println(input.charAt(i));
            }
        }
        public static void printPattern(int size) {
            for (int i = 0; i < size; i++) {
                // Print stars
                for (int j = 0; j < size - i - 1; j++) {
                    System.out.print("*");
                }
                
                // Print numbers
                for (int k = 0; k <= i; k++) {
                    System.out.print(k + 1);
                }
                
                // Move to the next line
                System.out.println();
            }
        }
        public static void wei(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
        
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= i * 2; k++) {
                System.out.print(k + 1);
            }
            System.out.println();
        }
      
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 0; j < size - i ; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= (i -1) * 2; k++) {
                System.out.print(k + 1);
            }
            System.out.println();
        }
        
        scanner.close();
            
        }
        public static void back(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            for(int i = 0; i < size; i++){
                for(int j = size; j >= size - i ; j --){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 0; i < size; i++){
            
                for(int j = 0; j<size - i- 1; j ++){
                    System.out.print("*");
                }
                if(i < size - 1)
                {System.out.println();}
            }
            
        }
        public static void rep(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine();
            inp = inp.replaceAll("[?]+", "?");
            inp = inp.replaceAll("[!]+", "!");
            System.out.println(inp);
        }
        public static void disgues(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine();
            int cat = inp.split("cat", -1).length;
            int rat = inp.split("rat", -1).length;
            int uwu = inp.trim().split("uwu", -1).length;
            System.out.println(uwu-1);
        }
        public static void theTHing(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            for(int i =size -1;i >= 0;i--){
                for(int j = 0;j<size - i  ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i =0;i<size;i++){
                for(int j = 0;j<size - i -1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
        public static void triangle(String[] args) {
            Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        // Print the centered triangle
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print asterisks
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }

        scan.close();
        }
        public static void xBs(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
           
            StringBuilder r = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0 || i == j || i == n - 1 || j == n - 1 || i + j == n-1)
                        r.append("*");
                    else
                        r.append("-");
                }
                r.append("\n");
            }
    
            System.out.print(r);
            sc.close();
        }
        public static void arrayList(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> inp = new ArrayList<>(Arrays.asList(1,2,4));
            String out = "";
            for(int i = 0; i<inp.size(); i++){
                String curo =  String.valueOf(inp.get(i));
                out += curo;
                
            }
            
            out = revToReuse(out);
            System.out.println(out);
            
            
        }
        public static void midPartAndReverse(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int mid = s.length() / 2;
            String output = "";
            StringBuilder first = new StringBuilder(s.substring(0, mid));
            output += first.reverse().toString();
            if (s.length() % 2 == 0) {
              StringBuilder last = new StringBuilder(s.substring(mid));
              output += last.reverse().toString();
            } else {
              StringBuilder last = new StringBuilder(s.substring(mid + 1));
              output += s.charAt(mid) + last.reverse().toString();
            }
            System.out.println(output);
            sc.close();
          }
          public static void midPartReverseAgain(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String output = "";
            int mid = s.length() / 2;
            for (int i = 0; i < mid; i++) {
              output += s.charAt(mid - 1 - i) + "";
            }
            if (s.length() % 2 != 0) {
              output += s.charAt(mid) + "";
              for (int i = s.length() - 1; i > mid; i--) {
                output += s.charAt(i) + "";
              }
            } else {
              for (int i = s.length() - 1; i >= mid; i--) {
                output += s.charAt(i) + "";
              }
            }
            System.out.println(output);
            sc.close();
          }
          public static void repllacetheQuesiotswithOne(String[] args) {
            Scanner sc = new Scanner(System.in);
            String sentence = sc.nextLine();
            sentence = sentence.replaceAll("[!]+", "!");
            sentence = sentence.replaceAll("[?]+", "?");
            sc.close();
            System.out.println(sentence);
        }
       
        

        public static void hoursToWeeks(String args[]){
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        
        int days = hours/24;
        int leftoverHours = hours%24;
        
        int weeks = days/7;
        int lefoverdays = days%7;
        

        System.out.println(weeks+" weeks, " + lefoverdays+ " days " + leftoverHours + " hours. ");
    }

          public static void catandmouseThree(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            int cat = 0;
            int mouse = 0;
            for (int i = 0; i < input.length() - 2; i++) {
                if (input.charAt(i) == 'c' && input.charAt(i + 1) == 'a' && input.charAt(i + 2) == 't')
                    cat++;
            }
            for (int i = 0; i < input.length() - 4; i++) {
                if (input.charAt(i) == 'm' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 'u'
                        && input.charAt(i + 3) == 's' && input.charAt(i + 4) == 'e')
                    mouse++;
            }
            if (cat == mouse)
                System.out.println("true");
            else
                System.out.println("false");
            sc.close();
        }
          public static void catandMouseLoopWay(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            sc.close();
            int cat = 0;
            int mouse = 0;
            for (int i = 0; i < input.length(); i++) {
                // To avoid index out of bound
                // Check condition first
                if (i + 2 < input.length() && input.substring(i, i + 3).equals("cat"))
                    cat++;
                if (i + 4 < input.length() && input.substring(i, i + 5).equals("mouse"))
                mouse++;
            }
            System.out.println(cat == mouse);
        }
        public static void xParrenCorref(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            sc.close();
            int len = s.length();
            if (len % 2 == 0) {
                System.out.println("Invalid word");
                return;
            }
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    if (i == j) {
                        System.out.print(s.charAt(i));
                    } else if (i + j == len - 1) {
                        System.out.print(s.charAt(len - 1 - i));
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }
        }
        public static void gurr(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String inp = scanner.nextLine();
            String[] x = inp.split(""); 
            System.out.println(x);
        }
            public static void gegeg(String[] args) {
                Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i - 1; j++) {
                    System.out.print("*");
                }
                for (int k = 0; k <= i * 2; k++) {
                    System.out.print(k + 1);
                }
                for (int j = size-i-1; j >=1; j--) {
                    System.out.print("*");
                }
                System.out.println();
        }
        }
        public static void connectingMetals(String args[]){
            Scanner scanner = new Scanner(System.in);
            int[] buyer = {3,5,7,8,2};
            int[] seller = {2,3,5,7};
        }
        public static void set(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String endLoop = "";
            Map<String, Integer> name = new HashMap<>();
            while (!endLoop.equals("STOP")) {
                endLoop = scanner.next();
                if (!endLoop.equals("STOP")) {
                    int value = scanner.nextInt();
                    name.put(endLoop, value);
                }
            }
            
            for (Map.Entry<String, Integer> entry : name.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
        
        public static void factor(String args[]) {
            Scanner scanner = new Scanner(System.in);
            String sentence = scanner.nextLine();
            int len = sentence.length();
            System.out.println(sentence.charAt(6));
        }
        public static void cl(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            String startsFirst = scanner.next(); // Read the first person as a String
            
            String startsSecond = startsFirst.equals("A") ? "B" : "A";
            int amountOfCoal = scanner.nextInt(); 
            int round = 0;
            int i = 1;
            int ran = 0;
        
            while (ran < amountOfCoal) {
                ran = (i * i) + i; // Compute the number of drinks in the current round
                i++;
            }
        
            round = i - 1;    
            int ms = round * round;
            int ms2 = ms + round;
            
            if (amountOfCoal <= ms) {
                if (startsFirst.equals("A")) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            } else if (amountOfCoal <= ms2) {
                if (startsSecond.equals("B")) {
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }
            }
        }
        public static void toBinary(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int inp = scanner.nextInt();
            String binary = "";
            while(inp > 0){
                int remainder = inp %2;
                binary = remainder + binary;
                inp/=2;
            }
            System.out.println(binary);
        }
        public static void qu(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            int catcount = 0;
            int mout = 0;
            int cat = str.split("cat", -1).length;
            int mouse = str.split("mouse", -1).length;


            if(cat == mouse){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
        public static void xagain(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            StringBuilder r = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || j == 0 || i == j || i == n - 1 || j == n - 1 || i + j == n - 1)
                        r.append("*");
                    else
                        r.append("-");
                }
                r.append("\n");
            }
    
            System.out.print(r);
            }
        
        
        
            
        public static void main(String[] args) {
            int[] x = {24,5,3};
            
            System.out.println(Arrays.toString(x));
        }

    }