package jdbcsessions;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class GUIDemo2  extends JFrame implements ActionListener
{
    
    JLabel lblusername,lblpassword,lblmessage;
    JTextField tfname,tfpassword;
    JButton login, reset;
    Connection con=null;
    Statement st=null;
    
    
    public GUIDemo2()
    {
         lblusername=new JLabel("UserName"); 
            lblpassword=new JLabel("Password:");
            tfname=new JTextField();
            tfpassword=new JTextField();
            login=new JButton("Login");
            reset=new JButton("Reset");
            lblmessage=new JLabel("");
            
            
            lblusername.setBounds(200,200,120,30);
            tfname.setBounds(330, 200,160,30);
            lblpassword.setBounds(200, 240,120,30);
            tfpassword.setBounds(330,240,160,30);
            login.setBounds(280,290,140,30);
            reset.setBounds(430,290,100,30);
            lblmessage.setBounds(540,220, 130,30);
            
            
            login.addActionListener(this);
            reset.addActionListener(this);
            
            add(lblusername);
            add(tfname);
            add(lblpassword);
            add(tfpassword);
            add(login);
            add(reset);
            add(lblmessage);
            
            setLayout(null);
            setSize(700,700);
            setVisible(true);
    }
    
    
    public static void main(String args[])
    {
    	GUIDemo2 obj=new GUIDemo2();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String uname=tfname.getText();
        String upassword=tfpassword.getText();
        
        try {
        //System.out.println("Button is clicked");
        if(e.getSource()==login)
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb7132","root","admin");
            st= con.createStatement();
            String query="select password from logindetail where userid='"+uname+"'";
            //System.out.println(query);
            
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                if(upassword.equals(rs.getString(1)))
                {
                    lblmessage.setText("valid user");
                }
                else
                {
                    lblmessage.setText("invalid user");
                }
            }
            
        }
        else if(e.getSource()==reset)
        {
        tfname.setText("");
        tfpassword.setText("");
        lblmessage.setText("");
        }
        }
      catch(Exception e1)
        {
          System.out.println(e1);
        }
    }
    
        
    }