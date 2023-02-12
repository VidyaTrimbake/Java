import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculator extends WindowAdapter implements ActionListener
{
    public JFrame mainframe;
    public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;//bAdd bSub bMult bDiv
    public JTextField t1;
    public JLabel lObj;
    public Float No;

    public Calculator(int width, int height, String Title)
    {
        mainframe = new JFrame(Title);//Panel
        mainframe.setSize(width,height);

        mainframe.addWindowListener(this);

        b1 = new JButton("Add");
        b2 = new JButton("Sub");
        b3 = new JButton("Mult");
        b4 = new JButton("Div");
        b5 = new JButton("1");
        b6 = new JButton("2");
        b7 = new JButton("3");
        b8 = new JButton("4");
        b9 = new JButton("5");
        b10 = new JButton("6");
        b11 = new JButton("7");
        b12 = new JButton("8");
        b13 = new JButton("9");
        b14 = new JButton("0");
        b15 = new JButton(".");
        b16 = new JButton("=");

        t1 = new JTextField();

        b1.setBounds(10,280,80,40);  // x,y,w,h
        b2.setBounds(100,280,80,40);
        b3.setBounds(190,280,80,40);
        b4.setBounds(290,280,80,40);    
        b7.setBounds(10,280,80,40);  // x,y,w,h
        b8.setBounds(100,280,80,40);
        b9.setBounds(190,280,80,40);
        b10.setBounds(290,280,80,40);  
        b11.setBounds(10,280,80,40);  // x,y,w,h
        b12.setBounds(100,280,80,40);
        b13.setBounds(190,280,80,40);
        b14.setBounds(290,280,80,40);  
        b15.setBounds(10,280,80,40);  // x,y,w,h
        b16.setBounds(100,280,80,40);


        t1.setBounds(70,100,100,40);

        mainframe.add(b1);
        mainframe.add(b2);
        mainframe.add(b3);
        mainframe.add(b4);  
        mainframe.add(b5);
        mainframe.add(b6);
        mainframe.add(b7);
        mainframe.add(b8); 
        mainframe.add(b9);
        mainframe.add(b10);
        mainframe.add(b11);
        mainframe.add(b12); 
        mainframe.add(b13);
        mainframe.add(b14);
        mainframe.add(b15);
        mainframe.add(b16); 

        mainframe.add(t1);

        lObj = new JLabel();
        lObj.setBounds(150,25,200,100);

        mainframe.add(lObj); 

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);        
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);        
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);

        //mainframe.setBackground(Color.Green);
        
        mainframe.setLayout(null);        
        mainframe.setVisible(true);                                                         
    }

    public void windowClosing(WindowEvent obj)  //Window closing method
    {
        System.exit(0);
    }

 /*    public void actionPerformed(ActionEvent obj)
    {
        try 
        {
            No = Float.parseInt(t1.getText());

            if(obj.getSource() == b1)
            {
                lObj.setText("Addition is: "+(No1+No2));
            }
            else if(obj.getSource() == b2)
            {
                lObj.setText("Substraction is: "+(No1-No2));
            }
            else if(obj.getSource() == b3)
            {
                lObj.setText("Multiplication is: "+(No1*No2));
            }
            else if(obj.getSource() == b4)
            {
                lObj.setText("Division is: "+(No1/No2));
            }
            else if(obj.getSource() == b1)
            {
                lObj.setText("Addition is: "+(No1+No2));
            }
            else if(obj.getSource() == b2)
            {
                lObj.setText("Substraction is: "+(No1-No2));
            }
            else if(obj.getSource() == b3)
            {
                lObj.setText("Multiplication is: "+(No1*No2));
            }
            else if(obj.getSource() == b4)
            {
                lObj.setText("Division is: "+(No1/No2));
            }
            else if(obj.getSource() == b1)
            {
                lObj.setText("Addition is: "+(No1+No2));
            }
            else if(obj.getSource() == b2)
            {
                lObj.setText("Substraction is: "+(No1-No2));
            }
            else if(obj.getSource() == b3)
            {
                lObj.setText("Multiplication is: "+(No1*No2));
            }
            else if(obj.getSource() == b4)
            {
                lObj.setText("Division is: "+(No1/No2));
            }
            else if(obj.getSource() == b1)
            {
                lObj.setText("Addition is: "+(No1+No2));
            }
            else if(obj.getSource() == b2)
            {
                lObj.setText("Substraction is: "+(No1-No2));
            }
            else if(obj.getSource() == b3)
            {
                lObj.setText("Multiplication is: "+(No1*No2));
            }
            else if(obj.getSource() == b4)
            {
                lObj.setText("Division is: "+(No1/No2));
            }
        }   
        catch(Exception eObj)
        {}

    }
    */
}

class MarvellousCalculatorDemo
{
    public static void main(String arg[])
    {
        Calculator cobj = new Calculator(800,800,"Marvellous Calculator");
    }
}