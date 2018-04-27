package JavaCool303;


import javax.swing.*;
import java.awt.*;

/**
 * <h1>Cool303Root (extends JPanel from javax.swing.*)</h1>
 * <ul>
 * <li>Add Containers to it</li>
 * <li>Optionally add Themed containers to it</li>
 * @see #addBoxes(int, int)
 * @see #addBoxes(int, int, Theme)
 * </ul>
 */
public class Cool303Root extends JPanel
{

    /**
     * Initialises the root as a JPanel
     */
   public Cool303Root(){ super(); }

    /**
     * Add Containers to root <br>
     * The number of containers and components they hold depends on user input
     * <ul>
     * <li> Input 2 integers for number of containers and components </li>
     * <li> Hardcode the layout of the root and a static resize condition if root has more containers that it can fit</li>
     * <li> To populate each container with components call addButtons(int, java.lang.String) </li>
     * <li> The title to be used for each container is hardcoded in the code below </li>
     * </ul>
     *
     * @param containerNumber Number of containers to add to root.
     * @param componentNumber Number of components to add to each container
     * @return Cool303Root, the root that was created
     */
    public Cool303Root addBoxes(int containerNumber,int componentNumber)
    {
        //Set all the parameters required
        Cool303Containers container= new Cool303Containers();
        Cool303Containers btnContainer;
        Cool303Root root = new Cool303Root();
        root.setLayout(new FlowLayout());

        //Set resizable root
        root.setPreferredSize(new Dimension(205,205));
        if(containerNumber*200 > 200) root.setPreferredSize(new Dimension(containerNumber*200,containerNumber*200));

        //add the containers to the root
        for (int i = 0; i < containerNumber; i++)
        {
            btnContainer = container.addButtons(componentNumber, "Title");
            root.add(btnContainer);
        }

        return root;
    }
    /**
     * Add themed Containers to root <br>
     * <ul>
     * <li> Overloaded method with a Theme object as input</li>
     * <li> The method is implemented the same way but checks what type of theme is given to apply theme if possible </li>
     * <li> Input a Theme Object to apply a color to this root </li>
     * <ul>
     * @param containerNumber Number of containers to add to root.
     * @param componentNumber Number of components to add to each container
     * @param theme The theme to apply to this root and pass it to each container
     * @return Cool303Root, the root that was created
     */
    public Cool303Root addBoxes(int containerNumber,int componentNumber, Theme theme)
    {
        {
            //Set all the parameters required
            Cool303Containers container= new Cool303Containers();
            Cool303Containers btnContainer;
            Cool303Root root = new Cool303Root();
            root.setLayout(new FlowLayout());

            //Set resizable root
            if(containerNumber*210 > 210) root.setPreferredSize(new Dimension(containerNumber*200,containerNumber*200));
            else root.setPreferredSize(new Dimension(210,210));


            //Set theme
            root.setBackground(theme.getBackground3());

            //add the containers to the root
            for (int i = 0; i < containerNumber; i++)
            {
                btnContainer = container.addButtons(componentNumber, "Title", theme);
                root.add(btnContainer);
            }

            return root;
        }

    };



}
