package jdbcsessions;
import java.awt.*;

public class Frame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LogoDemo l = new LogoDemo();
	}

}

class LogoDemo extends Frame{
	LogoDemo(){
		this.setTitle("User Defined Frame");
		this.setSize(500,300);
		this.setVisible(true);
		this.setBackground(Color.GREEN);
	}
	
	public void paint(Graphics g) {
		Font font = new Font("arial",Font.ITALIC + Font.BOLD,35);
		this.setForeground(Color.red);
		g.setFont(font);
		g.drawString("DYPIMR, Pimpri",100,100);
	}
}

