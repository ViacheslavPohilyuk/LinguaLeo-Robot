package Robot.Actions.OperationsImplementation;

/**
 * Created by mac on 07.02.17.
 */
public interface CommInterfaces {
    /**
     * Programm waits when the pixel gets the required color.
     * @param   colorRGB  RGB identifier of the color of the pixel
     * @param   x         X position of pixel
     * @param   y         Y position of pixel
     */
    public void waitColor(int colorRGB, int x, int y);

    /**
     * Programm waits when the pixel with the suitable color gets a new color.
     * @param   colorRGB  RGB identifier of the color of the pixel
     * @param   x         X position of pixel
     * @param   y         Y position of pixel
     */
    public void waitNotColor(int colorRGB, int x, int y);

    /**
     * Show the coordinate of the cursor and color of the pixel on which the cursor stand.
     */
    public void watchColor();

    /**
     * In the body of this method stored the URL of the page of the LinguaLeo Dictionary.
     * And this method opens Google Chrome and loads the web-page of dictionary
     */
    public void openLinguaDictionary();

    /**
     * Open any application in the folder Applications/
     */
    public void openApp(String appName);

    /**
     * Pressing and releasing of the left mouse button in the required coordinate
     * @param   x         X position of pixel
     * @param   y         Y position of pixel
     */
    public void leftClick(int x, int y);

    /**
     * Implements hot key: COMMAND + V. Pasting the text from the clipboard
     */
    public void paste();

    /**
     * Implements hot key: CONTROL + COMMAND + V. Full screen mode of the Google Chrome
     */
    public void fullScreen();

    /**
     * Implements hot key: SHIFT + COMMAND + V. Hide bookmark of the Google Chrome
     */
    public void removeChromePanel();
}
