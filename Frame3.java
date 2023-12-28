package jdbcsessions;
import java.awt.*;

public class Frame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWTDemo a = new AWTDemo();
	}

}

class AWTDemo extends Frame{
	AWTDemo(){
		this.setSize(500,300);
		this.setTitle("Vidya Trimbake");
		this.setVisible(true);
		this.setBackground(Color.black);
	}
	
	public void Paint(Graphics g) {
		Font font = new Font("arial",Font.ITALIC + Font.BOLD,35);
		this.setForeground(Color.red);
		g.setFont(font);
		g.drawString("DYPIMR, Pimpri",100,100);
	}
}
