package jdbcsessions;
import java.awt.*;

public class FirstButton extends Frame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstButton f = new FirstButton();
	}
	
	FirstButton(){
		Button b = new Button("click me");
		b.setBounds(30,100,80,30);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
		

}


