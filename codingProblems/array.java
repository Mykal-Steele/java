/**
 * array
 */
import java.util.*;
public class array {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; true; i++){
            int x = scanner.nextInt();
            if(x == 0){
                break;
            }
            arr.add(x);
        }
        System.out.println(arr.toString());
        int counter = 0;
        for(int i = 0; i<arr.size();i++){
          
            int x = arr.get(i);
            for(int y: arr){
                if(y == x){
                    counter++;
                }
            }
            
            System.out.println(x + " occurs " + counter + " times");
        }
    }

    
}