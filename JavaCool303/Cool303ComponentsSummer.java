package JavaCool303;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
/**
 * <h1>Cool303ComponentsSummer (extends Cool303Components)</h1>
 * Automatically applies the summer theme by making the component star-shaped
 * Private Shape object that give the component a set shape (star in this case)
 */
public class Cool303ComponentsSummer extends Cool303Components
{

    /**
     * Initialises the component as a Cool303Components and set up to change its shape
     */
    public Cool303ComponentsSummer()
    {
        super();
        Dimension size = getPreferredSize();
        size.width = size.height = Math.max(size.width, size.height);
        setPreferredSize(size);
        setContentAreaFilled(false);

    }
    /**
     * Method to make the container star shaped by changing the components layout <br>
     * @param arms Number of components to add to each container
     * @param center The optional title of this container: appears on top of the container
     * @param r_out The optional title of this container: appears on top of the container
     * @param r_in The optional title of this container: appears on top of the container
     * @return Shape, a shape object for the component
     */
    //Make star shaped buttons for summer theme
    public static Shape makeStarDesign(int arms, Point center, double r_out, double r_in) {
        double angle = Math.PI / arms;
        GeneralPath path = new GeneralPath();
        for (int i = 0; i < 2 * arms; i++) {
            double r = (i & 1) == 0 ? r_out : r_in;
            Point2D.Double p = new Point2D.Double(center.x + Math.cos(i * angle) * r, center.y + Math.sin(i * angle) * r);
            if (i == 0) path.moveTo(p.getX(), p.getY());
            else path.lineTo(p.getX(), p.getY());
        }
        path.closePath();
        return path;
    }

    /**
     * Overriden Method that sets up how the component will be displayed <br>
     * @param g Graphics object that paints the component
     */
    @Override
    protected void paintComponent(Graphics g) {
        if (getModel().isArmed()) {
            g.setColor(Color.lightGray);
        } else {
            g.setColor(getBackground());
        }
        Graphics2D graphics2d = (Graphics2D) g;
        graphics2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        graphics2d.fill(makeStarDesign(5, new Point(15,15), 15, 10));
        super.paintComponent(g);
    }

    /**
     * Overriden Method that sets up how the component's border will be displayed <br>
     * @param g Graphics object that paints the component
     */
    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(getForeground());
        Graphics2D graphics2d = (Graphics2D) g;
        graphics2d.draw(makeStarDesign(5, new Point(15,15), 15, 10));
    }

    Shape shape;
    /**
     * Overriden Method that sets up how the component's border will be displayed <br>
     * @param x Reference to set up the shape
     * @param y Reference to set up the shape
     * @return boolean, TRUE if the shape was successfully created or FALSE otherwise
     */
    @Override
    public boolean contains(int x, int y) {
        if (shape == null || !shape.getBounds().equals(getBounds())) {
            shape = new Area(makeStarDesign(5, new Point(15,15), 15, 10));
        }
        return shape.contains(x, y);
    }
}
