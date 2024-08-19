import java.util.Scanner;

/**
 * RecWithWeirdCornerLOL
 */
public class RecWithWeirdCornerLOL {

    public static void main(String[] args) {
        char symbol = '*';
        char dash = '-';
        String corner = "";
        String line = "";

        
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for(int i = 0; i < size; i++){
            if(i == 0){
                corner += dash;
            }else if(i>0){
                
                if(i == size - 1){
                    corner += dash;
                }else{
                    corner += symbol;
                }
            }
        }
        for(int i = 0; i < size; i++){
            line += symbol;
        }
        for(int i = 0;i < size; i++){
            if(i == 0){
                System.out.println(corner);
            }else{
                if(i == size - 1)
                {
                    System.out.println(corner);
                }else{
                System.out.println(line);
                }
            }
        }
        scanner.close();
    }
}