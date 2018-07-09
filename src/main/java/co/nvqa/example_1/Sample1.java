package co.nvqa.example_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Joi Partogi Hutapea
 */
public class Sample1
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Please input your name?");
        JOptionPane.showMessageDialog(null, "Hi "+input+"!");
    }
}
