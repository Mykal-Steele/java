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

        bombRadius += (bomb - 1);
        bombRadius += bomb;
        bombRadius += (bomb + 1);
  

        for (int i = 1; i <= numOfTrainCart; i++) {
            trainCart += i;
        }

        
        for (char ch : bombRadius.toCharArray()) {
            trainCart = trainCart.replace(Character.toString(ch), "");
        }
        String output = "";
        System.out.println(trainCart.length() + "tran len");
        

        for (char ch: trainCart.toCharArray()){
            if(output.length() <= trainCart.length() - 1)
            {
                output += Character.toString(ch) + " ";
            }
                else{
                output += Character.toString(ch);
            }
        }
        if(trainCart.length() == 0){
            System.out.println("DIE");
        }else
        {System.out.println(output);}
    }
}
