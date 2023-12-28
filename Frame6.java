package jdbcsessions;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Frame6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame6 fObj = new Frame6();
	}
	
	Frame6(){
		Frame f1 = new Frame("Hello first GUI");
		f1.setSize(300,300);
		
		TextField t1 = new TextField();
		t1.setBounds(20,120,150,30);
		f1.add(t1);
		
		Label l1 = new Label("Hello Friends");
		l1.setBounds(20,90,150,30);
		f1.add(l1);
		
		Button b1 = new Button("Click me");
		b1.setBounds(20,40,80,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.red);
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
