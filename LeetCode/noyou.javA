import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleBot {
    public static void main(String[] args) {
        try {
            // Create a Robot instance
            Robot robot = new Robot();
            
            // Wait for 3 seconds before typing
            Thread.sleep(3000);
            
            while (true) {
                // Type "no u"
                String text = "no u";
                for (char c : text.toCharArray()) {
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.getExtendedKeyCodeForChar(c));
                    robot.keyRelease(KeyEvent.getExtendedKeyCodeForChar(c));
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                }
                
                // Press Enter
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                
                // Wait for 1 second
                Thread.sleep(1000);
            }
        } catch (AWTException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
