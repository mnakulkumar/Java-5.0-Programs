import javax.swing.*;
import java.awt.*;

public class Button1{
	public static void main(String[] args){
		Button1 gui=new Button1();
		gui.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		/*JButton button = new JButton("Click This!"); 
		Font bigFont = new Font("serif",Font.BOLD,50);
		button.setFont(bigFont);
		frame.getContentPane().add(BorderLayout.NORTH,button);*/

		JButton east= new JButton("East");
		JButton west = new JButton("West");
		JButton north = new JButton("North");
		JButton south = new JButton("South");
		JButton center = new JButton("Cemter");
		frame.getContentPane().add(BorderLayout.EAST,east);
		frame.getContentPane().add(BorderLayout.WEST,west);
		frame.getContentPane().add(BorderLayout.NORTH,north);
		frame.getContentPane().add(BorderLayout.SOUTH,south);
		frame.getContentPane().add(BorderLayout.CENTER,center);

		frame.setSize(200,200);
		frame.setVisible(true);
	}
}
