import java.util.*;

public class EncryptionArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wordCount = scanner.nextInt();
        scanner.nextLine(); 
        String sentence = scanner.nextLine();
        String[] wordsArray = sentence.split(" ");
        String transformedWord = "";
        String[] transformedWordsArray = new String[wordsArray.length];
        boolean isUpperCase = true;
        int index = 0;

        for (String word : wordsArray) {
            isUpperCase = true;
            for (int i = 0; i < word.length(); i++) {
                if (isUpperCase) {
                    transformedWord += word.substring(i, i + 1).toUpperCase();
                    isUpperCase = false;
                } else {
                    transformedWord += word.substring(i, i + 1).toLowerCase();
                    isUpperCase = true;
                }
            }
            transformedWordsArray[index] = transformedWord; 
            transformedWord = ""; 
            index++;
        }

        String[] outputArray = new String[transformedWordsArray.length];
        String upperCaseLetters = "";
        String lowerCaseLetters = "";
        String combinedOutput = "";
        int outputIndex = 0;

        for (String str : transformedWordsArray) {
            upperCaseLetters = str.replaceAll("[^A-Z]", ""); 
            lowerCaseLetters = str.replaceAll("[^a-z]", ""); 
            combinedOutput = lowerCaseLetters + upperCaseLetters;
            outputArray[outputIndex] = combinedOutput; 
            outputIndex++;
        }

        String finalOutput = "";
        for (int i = 0; i < outputArray.length; i++) {
            finalOutput += outputArray[i] + " "; 
        }
        System.out.print(finalOutput.trim()); 
    }
}