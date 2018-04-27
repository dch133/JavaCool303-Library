package JavaCool303;

import java.awt.*;
/**
 * <h1>Cool303 Pastel Theme</h1>
 *Has 4 hardcoded Color objects and 4 color getters
 * <ul>
 * @see #getBackgroundColor()
 * @see #getBackground2()
 * @see #getBackground3()
 * @see #getColor()
 * </ul>
 */
public class Pastel extends Theme
{
    //HardCoded colors for this theme
    private Color btnColor = new Color( 233, 245, 123 );
    private Color background2 = new Color( 155, 207, 245 ); //pastel blue
    private Color background = new Color( 245, 159, 172 ); //Beige color
    private Color background3 = Color.LIGHT_GRAY;


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
