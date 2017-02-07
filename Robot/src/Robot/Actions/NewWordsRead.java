package Robot.Actions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mac on 05.02.17.
 */
public class NewWordsRead {
    public List<String> read() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("resources/Words.txt"));

            int i = 0;
            String s;
            List<String> wordsFile = new ArrayList<>();

            while ((s = in.readLine()) != null) {
                wordsFile.add(s);
            }
            in.close();

            Collections.sort(wordsFile); // sorting words

            return wordsFile;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
