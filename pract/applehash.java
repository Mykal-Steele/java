import java.util.Scanner;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class applehash{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<Character,Integer> hashMap = new HashMap<>();
        while(true){
            char key = scanner.next().charAt(0);
            if (key == '0') {
                break;
            }
            int value = scanner.nextInt();
            
            scanner.nextLine();
            if(hashMap.containsKey(key)){
                int cur = hashMap.get(key);
                hashMap.put(key, cur + value);
            }else{
                hashMap.put(key,value);
            }
            
        }
        char toCheck = scanner.next().charAt(0);
        System.out.print(hashMap.get(toCheck));
    }
}
