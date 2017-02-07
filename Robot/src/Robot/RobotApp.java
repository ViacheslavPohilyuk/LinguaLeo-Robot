package Robot;

import Robot.Actions.OperationsImplementation.Commands;
import Robot.Actions.NewWordsRead;
import Robot.Actions.TextTransfer;

import java.awt.Robot;
import java.awt.AWTException;

/**
 * Created by mac on 06.02.17.
 */
public class RobotApp {
    public void application() throws AWTException {
        Robot robot = new Robot();

        NewWordsRead nwr = new NewWordsRead();
        TextTransfer ttr = new TextTransfer();
        Commands comm = new Commands(robot);

        java.util.List<String> words = nwr.read();

        //*** Instructions for the robot ***/

        comm.openLinguaDictionary();
        robot.delay(2000);

        comm.waitColor(-855310, 754, 194); // waiting color of the grey panel on the page with dictionary
        robot.delay(500);

        // Adding new words in the vocabulary
        int wordsCount = words.size();
        for (int i = wordsCount; i > 0; i--) {
            comm.leftClick(468, 150);
            robot.delay(500);
            ttr.setData(words.get(i - 1)); // write a word from the Words.txt to the clipboard
            comm.paste();

            robot.delay(400);
            comm.leftClick(672, 154); // click to add word
            robot.delay(500);

            comm.waitNotColor(-1053216, 490, 182);
            robot.delay(750);
            comm.leftClick(496, 189); // add new word
        }
    }
}
