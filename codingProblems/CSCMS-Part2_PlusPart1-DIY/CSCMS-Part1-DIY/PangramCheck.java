import java.util.*;
public class PangramCheck{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().toLowerCase();
        Set<Character> alphabet = new HashSet<>();
        for(char x: inp.toCharArray()){
            if(x>='a' && x<='z'){
                alphabet.add(x);
            }
        }
        if(alphabet.size() == 26){
            System.out.print("Pangram");
        }else{
            System.out.print("Not Pangram");
        }
    
    }
}