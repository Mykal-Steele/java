/**
 * smt
 */
import java.util.Arrays;
public class smt {

    public static void WINDOWpOSsUM(int[] a , int n)  {
        
        for(int i = 0; i< a.length; i ++){
            int cur = a[i]; 
            if(cur > 0){ 
                int sum = 0;
                for (int j = 0; j <= n && i + j < a.length; j++) {
                    sum += a[i+j];
                }
                a[i] = sum;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        // Example usage
        int[] exampleArray = {0, 2, -3,4,5,4};
        WINDOWpOSsUM(exampleArray, 3);
    }
}