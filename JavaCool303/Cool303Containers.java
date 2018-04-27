package JavaCool303;

import java.awt.*;
import javax.swing.*;

/**
 * <h1>Cool303Containers (extends JPanel from javax.swing.*)</h1>
 * <ul>
 * <li>Add Components to it</li>
 * <li>Optionally add Themed components to it</li>
 * @see #addButtons(int, java.lang.String)
 * @see #addButtons(int, java.lang.String, Theme)
 * </ul>
 */
public class Cool303Containers extends JPanel
{
    /**
     * Initialises the container as a JPanel
     */
    public Cool303Containers() { super(); }

    /**
     * Add Components to Container <br>
     * The number of components and the title of the container they hold depends on user input<br>
     * <ul>
     * <li> Input an integer for number components to add</li>
     * <li> Hardcode the layout of the container and a static resize condition if container has more components that it can fit</li>
     * <li> To populate each container with components create Cool303Components with JLabels </li>
     * <li> Add an actionListener for each component: when it is clicked,print its label to console </li>
     *</ul>
     * @param number Number of components to add to each container
     * @param setTitle The optional title of this container: appears on top of the container
     * @return Cool303Containers, the container that was created
     *

     */
    public Cool303Containers addButtons(int number, String setTitle)
    {
        //Set up the display box
        Cool303Components button;
        Cool303Containers panel = new Cool303Containers();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setLayout(new BorderLayout());

        //set the title via user input
        JLabel title = new JLabel(setTitle);
        title.setFont( new Font("TimesNewRoman", Font.BOLD, 14));
        panel.add(title, BorderLayout.NORTH);

        //Create a panel on which you add all the components (buttons)
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout());
        panel.add(btnPanel, BorderLayout.CENTER);

        //Add buttons
        for (int i = 1; i <= number; i++)
        {   //make a numbered label, align it and add to the button
            button = new Cool303Components();
            JLabel label = new JLabel((""+i));
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            button.add(label);
            button.setActionCommand("" + i);
            button.setPreferredSize(new Dimension(30, 30));

            //Set borders to see the components and containers properly
            button.setBorder(BorderFactory.createLineBorder(Color.black));
            panel.setBorder(BorderFactory.createLineBorder(Color.black));

            btnPanel.add(button);

            //On click, print the label of that button to console
            button.addActionListener(actionEvent ->
            {
                String command = actionEvent.getActionCommand();
                for (int i1 = 1; i1 <= number; i1++)
                {
                    if (command.equals("" + i1)) System.out.println("Button " + i1 + " clicked.");
                }
            });
        }
        return panel;

    }

    /**
     * Add themed Containers to root <br>
     *
     * Overloaded method with a Theme object as input<br>
     * The method is implemented the same way but checks what type of theme is given to apply theme if possible <br>
     * Input a Theme Object to apply a color to this container and its components as they are created <br>
     * @param number Number of components to add to each container
     * @param setTitle The optional title of this container: appears on top of the container
     * @param theme The theme to apply to each container and component
     * @return Cool303Containers, the container that was created
     */

    public Cool303Containers addButtons(int number, String setTitle, Theme theme)
    {
        {
            //Set up the display box
            Cool303Components button;
            Cool303Containers panel = new Cool303Containers();
            panel.setBorder(BorderFactory.createLineBorder(Color.black));
            panel.setPreferredSize(new Dimension(200, 200));
            panel.setLayout(new BorderLayout());
            panel.setBackground(theme.getBackgroundColor()); // set Title background color

            //set the title via user input
            JLabel title = new JLabel(setTitle);
            title.setFont( new Font("TimesNewRoman", Font.BOLD, 14));
            panel.add(title, BorderLayout.NORTH);

            //Set a panel on which you add all the buttons
            JPanel btnPanel = new JPanel();
            btnPanel.setBackground(theme.getBackground2()); //set background
            btnPanel.setLayout(new FlowLayout());
            panel.add(btnPanel, BorderLayout.CENTER);

            //Add buttons
            for (int i = 1; i <= number; i++)
            {
                //Choose the type of component to create based on the theme input
                if (theme.getClass().getSimpleName().equals("Summer")) button = new Cool303ComponentsSummer(); //Summer themed component
                else if (theme.getClass().getSimpleName().equals("Pastel")) button = new Cool303ComponentsPastel(); //Pastel themed component
                else button = new Cool303Components(); //No themed (default) component

                //make a numbered label, align it and add to the button
                JLabel label = new JLabel((""+i));
                label.setAlignmentX(Component.CENTER_ALIGNMENT);
                button.add(label);

                //Add a theme
                button.setBackground(theme.getColor()); //set button color

                //Add onClick response on command prompt
                button.setActionCommand("" + i);
                button.setPreferredSize(new Dimension(30, 30));
                button.setBorder(null);//remove 3 dots from buttons to show label
                btnPanel.add(button);

                button.addActionListener(actionEvent ->
                {
                    String command = actionEvent.getActionCommand();
                    for (int i1 = 1; i1 <= number; i1++)
                    {
                        if (command.equals("" + i1)) System.out.println("Button " + i1 + " clicked.");
                    }
                });
            }
            return panel;

        }
    }


}
