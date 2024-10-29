import java.util.*;
public class Subsequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String firstInp = scanner.nextLine();
        char[] first = firstInp.toCharArray();
        String secInp = scanner.nextLine();
        char[] sec = secInp.toCharArray();
        
        Set<Character> set = new HashSet<>();
        
        for(char x:sec){
            set.add(x);
        }
        int secSize = set.size();
        for(char y : first){
            set.add(y);
        }
        int secSize2 = set.size();
       
        if(secSize == secSize2){
            if(first.length == sec.length && !firstInp.equals(secInp)){
                System.out.print("false");
                return;
            }
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
}