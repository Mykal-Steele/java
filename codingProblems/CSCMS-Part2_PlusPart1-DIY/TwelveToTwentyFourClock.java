import java.util.Scanner;

public class TwelveToTwentyFourClock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] inpS = inp.split(" ");
        int hour = Integer.valueOf(inpS[0]);
        int min = Integer.valueOf(inpS[1]);
        String time = inpS[2];
        int outHour = 0;
        int counter = 1;;
        int outMin = min;
        if (time.equals("am")) {
            outHour = hour;
            if (hour == 12) {
                outHour = 0;
            }
        } else {

            outHour = 12 + hour;
            if (hour == 12) {
                outHour = 12;
            }
        }

        if (outHour < 10) {
            System.out.print("0" + outHour + ":");
        } else {
            System.out.print(outHour + ":");
        }

        if (outMin < 10) {
            System.out.print("0" + outMin);
        } else {
            System.out.print(outMin);
        }

    }
}