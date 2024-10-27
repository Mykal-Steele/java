import java.util.Scanner;

/**
 * NineElevenButTrains
 */
public class NineElevenButTrains {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfTrainCart = scanner.nextInt();
        int bomb = scanner.nextInt();
        String trainCart = "";
        String bombRadius = "";
        bombRadius += (bomb - 1) + " ";
        bombRadius += bomb + " ";
        bombRadius += bomb + 1;
        
        if(bombRadius.equals("0 1 2")){
            bombRadius = "1 2";
        }
        
        for(int i = 1; i<=numOfTrainCart; i++){
            
            
            if(i == numOfTrainCart){
                trainCart += i;
            }else{
                trainCart += i + " ";
            }
            
        }
        
        String output = trainCart.replace(bombRadius + " ", "");
        
        if(output.equals(bombRadius)){
            System.out.println("DIE");
        }     else{
        System.out.println(output);
        }
        scanner.close();
    }
}