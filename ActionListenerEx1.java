package jdbcsessions;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerEx1 implements ActionListener {
	
	Frame f;
	Button b;
	TextField tf;
	
	public static void main(String[] args) {	
		ActionListenerEx1 e = new ActionListenerEx1();
	}
	
	ActionListenerEx1(){
		
		f = new Frame("ActionListener Ex1 ");
		tf = new TextField();
		tf.setBounds(50,50,150,20);
		
		b = new Button("click Here");
		b.setBounds(50,100,60,30);
		
		b.addActionListener(this);
		f.add(b);
		f.add(tf);
		
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}	
		});
		
	}
	
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome to Javapoint");
	}
	

}
