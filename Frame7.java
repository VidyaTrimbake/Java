package jdbcsessions;
import java.awt.*;
import java.awt.event.*;

public class Frame7 extends Frame implements WindowListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame7();
	}
	
	Frame7(){
		this.setSize(400, 400);
		this.setVisible(true);
		this.setLayout(null);
		
		Label LFirstName = new Label("First Name  : ");
		LFirstName.setBounds(10,40,100,20);
		add(LFirstName);
		
		TextField TFirstName = new TextField();
		TFirstName.setBounds(100,40,100,20);
		add(TFirstName);
		
		
		Label LLastName = new Label("Last Name   : ");
		LLastName.setBounds(10,70,100,20);
		add(LLastName);
		
		TextField TLastName = new TextField();
		TLastName.setBounds(100,70,100,20);
		add(TLastName);
		
		Label LMobNo = new Label("Mobile No    : ");
		LMobNo.setBounds(10,100,100,20);
		add(LMobNo);
		
		TextField TMobNo = new TextField();
		TMobNo.setBounds(100,100,100,20);
		add(TMobNo);

		Label LGender = new Label("Gender      : ");
		LGender.setBounds(10,130,100,20);
		add(LGender);
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("Male",cbg,false);
		c1.setBounds(100,130,100,20);
		
		Checkbox c2 = new Checkbox("Female",cbg,true);
		c2.setBounds(200,130,100,20);
		
		add(c1);
		add(c2);
		
		addWindowListener(this);
	}
	

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		this.dispose();
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
