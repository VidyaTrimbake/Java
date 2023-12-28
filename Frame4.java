package jdbcsessions;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Frame4 extends Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame4();
	}
	
	Frame4(){
		this.setSize(400,400);
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				this.dispose();
			}

			private void dispose() {
				// TODO Auto-generated method stub
				
			}
		});
	}
	

}
