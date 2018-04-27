package JavaCool303;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

/**
 * <h1>Cool303 Summer Theme</h1>
 *Has 4 hardcoded Color objects and 4 color getters
 * <ul>
 * @see #getBackgroundColor()
 * @see #getBackground2()
 * @see #getBackground3()
 * @see #getColor()
 * </ul>
 */
public class Summer extends Theme
{
    //HardCoded colors for this theme
    private Color background = Color.YELLOW;
    private Color background2 = Color.GREEN;
    private Color background3 = Color.ORANGE;
    private Color btnColor = new Color( 245, 78, 0 );


    //Get all the colors
    /**
     * Get a Color object
     * @return Color btnColor attribute
     */
    @Override
    public Color getColor() { return btnColor; }
    /**
     * Get a Color object
     * @return Color background attribute
     */
    @Override
    public Color getBackgroundColor() { return background; }
    /**
     * Get a Color object
     * @return Color background2 attribute
     */
    @Override
    public Color getBackground2() { return background2; }
    /**
     * Get a Color object
     * @return Color background3 attribute
     */
    @Override
    public Color getBackground3() { return background3; }
}
