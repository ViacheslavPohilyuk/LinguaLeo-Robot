package Robot.Actions.OperationsImplementation;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;

/**
 * Created by mac on 05.02.17.
 */
public class Commands implements CommInterfaces{
    private Robot robot;
    
    public Commands (Robot robot) {
        this.robot = robot;
    }
    
    public void waitColor(int colorRGB, int x, int y) {
        Color temp = new Color(colorRGB);
        int colorDictionaryPanel = temp.getRGB();
        Color currentColor = robot.getPixelColor(x, y);

        while (colorDictionaryPanel != currentColor.getRGB()) {
            robot.delay(20);
            currentColor = robot.getPixelColor(x, y);
        }
    }

    public void waitNotColor(int colorRGB, int x, int y) {
        Color temp = new Color(colorRGB);
        int colorDictionaryPanel = temp.getRGB();
        Color currentColor = robot.getPixelColor(x, y);

        while (colorDictionaryPanel == currentColor.getRGB()) {
            robot.delay(20);
            currentColor = robot.getPixelColor(x, y);
        }
    }

    public void watchColor() {
        Color c;
        double x, y;
        Point location;
        while (true) {
            location = MouseInfo.getPointerInfo().getLocation();
            x = location.getX();
            y = location.getY();
            c = robot.getPixelColor((int) x, (int) y);
            robot.delay(20);
            System.out.print("Pointer coordinate: " + x + " " + y + " color: " + c.getRGB());
            System.out.println();
        }
    }

    public void openLinguaDictionary()  {
        try {
            Desktop.getDesktop().browse(URI.create("https://lingualeo.com/ru/glossary/learn/dictionary"));
        }
        catch (IOException e) {
            System.err.println("Can't open web-page or web-browser!");
            e.printStackTrace();
        }
    }

    public void openApp(String appName)  {
        try {
            Runtime.getRuntime().exec(
                    new String[] {
                            "open", "/Applications/+" + appName + ".app"
                    });
            robot.delay(2000);
        }
        catch (IOException e) {
            System.err.println("Can't find application!");
            e.printStackTrace();
        }
    }

    public void leftClick(int x, int y) {
        robot.mouseMove(x,y);
        robot.delay(100);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(50);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public void paste() {
        int keyCodeCtrl = KeyEvent.VK_META; // the COMMAND key
        int keyCodeV = KeyEvent.VK_V;       // the V key

        robot.keyPress(keyCodeCtrl);
        robot.delay(50);
        robot.keyPress(keyCodeV);
        robot.delay(50);

        robot.keyRelease(keyCodeCtrl);
        robot.keyRelease(keyCodeV);
    }

    public void fullScreen() {
        int keyCommand = KeyEvent.VK_META; // the COMMAND key
        int keyCtrl = KeyEvent.VK_CONTROL; // the CONTROL key
        int keyF = KeyEvent.VK_F;          // the F key

        robot.keyPress(keyCommand);
        robot.delay(50);
        robot.keyPress(keyCtrl);
        robot.delay(50);
        robot.keyPress(keyF);
        robot.delay(50);

        robot.keyRelease(keyCommand);
        robot.keyRelease(keyCtrl);
        robot.keyRelease(keyF);
    }

    public void removeChromePanel() {
        int keyCommand = KeyEvent.VK_META; // the COMMAND key
        int keyCtrl = KeyEvent.VK_SHIFT;   // the SHIFT key
        int keyF = KeyEvent.VK_F;          // the F key

        robot.keyPress(keyCommand);
        robot.delay(50);
        robot.keyPress(keyCtrl);
        robot.delay(50);
        robot.keyPress(keyF);
        robot.delay(50);

        robot.keyRelease(keyCommand);
        robot.keyRelease(keyCtrl);
        robot.keyRelease(keyF);
    }
}

