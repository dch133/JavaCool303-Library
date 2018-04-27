package JavaCool303;

import javax.swing.*;
import java.awt.*;

/**
 * <h1>JavaCool303-Swing Library</h1>
 * <ul>
 * <li>Display roots that have containers full of components</li>
 * <li>Update the theme for each root</li>
 * </ul>
 * @author Daniel Chernis 260707258
 *
 */

public class Cool303Frame extends JFrame
{

    /**
     * Display GUI <br>
     * Show a dialog box with theme options.<br>
     * The number of Roots, Containers, Components displayed, and the Theme applied is handcoded <br>
     * Run Cool303Main and select one of the available options in pop-up window:
     * <ul>
     * <li> Pastel</li>
     * <li> Summer</li>
     * <li> Vanilla (no Theme)</li>
     * <li> All (displays all currently available themes (hardcoded) )</li>
     * <li> Cancel (exit application)</li>
     * </ul>
     *<br>
     * How to use import:
     * <ul>
     * <li>Create a class with a main method in the same workplace as JavaCool303 folder</li>
     * <li>use "import JavaCool303.* "</li>
     * <li>Create a Cool303Frame variable and run cool303Frame.display() (as shown in Cool303Main)</li>
     * <ul>
     */
    public static void display()
    {
            JFrame mainFrame = new JFrame("JavaCool303");
            mainFrame.setSize(400, 400);
            mainFrame.setLayout(new FlowLayout());
            Cool303Root coolRoot = new Cool303Root();


            String[] options = new String[] {"Pastel", "Summer", "Vanilla","All", "Cancel"};
            int response = JOptionPane.showOptionDialog(null, "Please Choose a Theme", "Cool303Theme Selection",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                    null, options, options[0]);
            if (response == 0) //Pastel
            {
                JPanel panel = coolRoot.addBoxes(1, 20, new Pastel());
                mainFrame.add(panel);
            }
            else if (response == 1) //Summer
            {
                JPanel panel2 = coolRoot.addBoxes(1, 20, new Summer());
                mainFrame.add(panel2);
            }
            else if (response == 2) //Vanilla
            {
                JPanel panel3 = coolRoot.addBoxes(1, 20);
                mainFrame.add(panel3);
            }
            else if (response == 3) //All
            {
                JPanel panel = coolRoot.addBoxes(1, 20, new Pastel());
                mainFrame.add(panel);
                JPanel panel2 = coolRoot.addBoxes(1, 20, new Summer());
                mainFrame.add(panel2);
                JPanel panel3 = coolRoot.addBoxes(1, 20);
                mainFrame.add(panel3);
            }
            else System.exit(0); //Cancel

            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setVisible(true);

    }


}
