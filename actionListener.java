package jdbcsessions;
import java.awt.*;
import java.awt.event.*;

public class actionListener implements ActionListener{

	public static void main(String[] args) {
		Frame f = new Frame("Frame");
		
		f.setSize(400,400);
		f.setVisible(true);
		
		Button b = new Button("Click");
		b.setBounds(20,100,100,30);
		f.add(b);
		
		TextField tf = new TextField(10);
		tf.setBounds(20,130,100,30);
		f.add(tf);
		
		b.addActionListener(null);
		
//		f.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				f.dispose();
//			}	
//		});
		
	}

}
