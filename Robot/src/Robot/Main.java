package Robot;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by mac on 06.02.17.
 */
public class Main {
    public static void main(String[] args) throws AWTException {
        AppletKeyListener akl = new AppletKeyListener();
        RobotApp robotObj = new RobotApp();
        robotObj.application();
    }
    private static class AppletKeyListener implements KeyListener {
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_F) {
                System.out.println("Key pressed!");
            }
        }
        public void keyReleased(KeyEvent e) {

        }

        public void keyTyped(KeyEvent e) {

        }
    }
}


