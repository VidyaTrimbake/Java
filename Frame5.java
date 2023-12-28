package jdbcsessions;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame5 f = new Frame5();
	}
	public Frame5() {
		Frame f1 = new Frame("Hello first GUI");
		f1.setSize(300,300);
		
		Button b1 = new Button("Click me");
		b1.setBounds(20,40,80,30);
		f1.add(b1);
		
		f1.setLayout(null);
		f1.setVisible(true);
		
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f1.dispose();
			}	
		});
	}
}
