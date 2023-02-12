import javax.swing.*;
import java.awt.event.*;

class Calculator extends WindowAdapter
{
    public JFrame mainframe;

    public Calculator(int width, int height, String Title)
    {
        mainframe = new JFrame(Title);
        mainframe.setSize(width,height);
        mainframe.setVisible(true);

        mainframe.addWindowListener(this);
    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}

class MarvellousCalculator
{
    public static void main(String arg[])
    {
        Calculator cobj = new Calculator(400,400,"Marvellous Calculator");
    }
}