import java.awt.*;
import java.lang.*;
import java.awt.event.*;

class MarvellousFrame
{
    public MarvellousFrame(String title)
    {
        Frame fobj = new Frame(title);
        fobj.setSize(500,500);
        fobj.setVisible(true);

        Button bObj = new Button("Ok");
        fobj.add(bObj);
        fobj.addWindowListener(new MarvellousListener());
    }
}

class MarvellousListener extends WindowAdapter
{
    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }
}

class GUI4
{
    public static void main(String arg[]) throws Exception
    {
        MarvellousFrame mobj = new MarvellousFrame("Marvellous PPA41");
    }
}