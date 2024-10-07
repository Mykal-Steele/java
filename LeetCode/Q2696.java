/**
 * 2696
 */
public class Q2696 {
    class Solution {
        public int minLength(String s) {    
            boolean didOperation = false;
            
    
            do {
                didOperation = false;
                for (int i = 0; i < s.length() - 1; i++) {
                    if (s.substring(i, i+2).equals("AB") || s.substring(i, i+2).equals("CD")) {
                        s = s.substring(0, i) + s.substring(i+2);
                        didOperation = true;
                        break; 
                    }
                }
            } while (didOperation);
    
            return s.length();
    
        }
    }
    
}