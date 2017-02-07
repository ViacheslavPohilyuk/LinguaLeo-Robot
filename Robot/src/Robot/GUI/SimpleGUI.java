package Robot.GUI;

/**
 * Created by mac on 05.02.17.
 */
import java.awt.*;
import javax.swing.*;

    public class SimpleGUI extends JFrame {
        private JLabel label = new JLabel("Cursor position:");

        public SimpleGUI() throws InterruptedException {
            super("Simple Example");
            this.setBounds(100, 100, 250, 100);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = this.getContentPane();
            container.setLayout(new GridLayout(3, 2, 2, 2));
            container.add(label);
        }

        private void watchColor() throws InterruptedException {
                // t = new Thread();
                Color c;
                double x, y;
                Point location;
                while (true) {
                    location = MouseInfo.getPointerInfo().getLocation();
                    x = location.getX();
                    y = location.getY();

                    label.setText(" Pointer coordinate");
                    //t.sleep(500);
                }
            }
        }

