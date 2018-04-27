package JavaCool303;

import java.awt.*;

/**
 * <h1>Cool303 abstract Theme Object</h1>
 *Has 4 color getters
 * <ul>
 * @see #getBackgroundColor()
 * @see #getBackground2()
 * @see #getBackground3()
 * @see #getColor()
 * </ul>
 */
public abstract class Theme
{

    //Get all the colors
    /**
     * Get a Color object
     * @return Color attribute
     */
    public abstract Color getBackgroundColor(); //Color the container
    /**
     * Get a Color object
     * @return Color attribute
     */
    public abstract Color getBackground2();
    /**
     * Get a Color object
     * @return Color attribute
     */
    public abstract Color getBackground3();
    /**
     * Get a Color object
     * @return Color attribute
     */
    public abstract Color getColor(); //Color the component

}
