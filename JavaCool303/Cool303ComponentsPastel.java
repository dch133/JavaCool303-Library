package JavaCool303;

import java.awt.*;
import java.awt.geom.Ellipse2D;
/**
 * <h1>Cool303ComponentsPastel (extends Cool303ComponentsSummer)</h1>
 * Automatically applies the pastel theme by making the component bubble-shaped
 * Private Shape object that give the component a set shape (circle in this case)
 */
public class Cool303ComponentsPastel extends Cool303Components
{
    /**
     * Initialises the component as a Cool303Components and set up to change its shape
     */
    public Cool303ComponentsPastel()
    {
        super();
        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width, size.height);
        setPreferredSize(size);
        setContentAreaFilled(false);

    }

    /**
     * Overriden Method that sets up how the component will be displayed <br>
     * @param g Graphics object that paints the component
     */
    //Make a bubble shape for the buttons
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        g.fillOval(0, 0, getSize().width-1, getSize().height-1);
        super.paintComponent(g);
    }

    /**
     * Overriden Method that sets up how the component's border will be displayed <br>
     * @param g Graphics object that paints the component
     */
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        g.drawOval(0, 0, getSize().width-1, getSize().height-1);
    }
    Shape shape;
    /**
     * Overriden Method that sets up how the component's border will be displayed <br>
     * @param x Reference to set up the shape
     * @param y Reference to set up the shape
     * @return boolean, TRUE if the shape was successfully created or FALSE otherwise
     */
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new Ellipse2D.Float(0, 0, getWidth(), getHeight());
        }
        return shape.contains(x, y);
    }

}


