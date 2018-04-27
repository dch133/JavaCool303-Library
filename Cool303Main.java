
import javax.swing.*;
import JavaCool303.*;
/**
 * <h1>Main Method: Use of API example</h1>
 * Make sure the JavaCool303 folder is in the same directory as your application file
 * This is to show how to use the library. Run it to see what happens.
 */
public class Cool303Main
{
    public static void main(String[] args)
    {
        try
        {
            Cool303Frame frame = new Cool303Frame();
            frame.display();


        } catch (java.lang.Exception e)
        {
            JOptionPane.showMessageDialog(null, "GUI Error");
            e.printStackTrace();
        }
    }
}
