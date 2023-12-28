package jdbcsessions;
import java.awt.*;

public class Button2 extends Frame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button2 b = new Button2();
	}
	
	Button2(){
		Button B1 = new Button("Button1");
		B1.setBounds(30,100,80,30);
		add(B1);
		
		Button B2 = new Button("Button2");
		B2.setBounds(130,100,80,30);
		add(B2);
		
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}

}
