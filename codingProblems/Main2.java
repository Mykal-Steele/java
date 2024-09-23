import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] lst = {2,6,3,8,3, 6,8,5,2};
        boolean sort = true;
        while (sort) {
            sort = false;
            for(int i = 0; i< lst.length-1; i++){
                if(lst[i]< lst[i+1]){
                    sort = true;
                    int temp = lst[i];
                    lst[i] = lst[i+1];
                    lst[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(lst));
    }
}