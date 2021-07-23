import javax.swing.*;
import java.awt.*;

public class ButtonExercise{
	public static void main(String[] args){
		ButtonExercise gui= new ButtonExercise();
		gui.go();
	}

	public void go(){
		/*JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel. setBackground (Color.darkGray) ;
		JButton button = new JButton("tesuji") ;
		JButton buttonTwo = new JButton("watari") ;
		frame.getContentPane().add(BorderLayout.NORTH,panel);
		panel.add(buttonTwo);
		frame.getContentPane() .add(BorderLayout.CENTER,button);*/ // D=>2

		/*JFrame frame = new JFrame() ;
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		JButton button = new JButton("tesuji");
		JButton buttonTwo = new JButton("watari") ;
		panel.add(buttonTwo);
		frame.getContentPane().add(BorderLayout.CENTER,button);
		frame.getContentPane().add(BorderLayout.EAST, panel);*/ //B=>6

		/*JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);
		JButton button = new JButton("tesuji");
		JButton buttonTwo = new JButton("watari") ;
		panel.add(buttonTwo);
		frame.getContentPane().add(BorderLayout.CENTER,button);*/ //C=>1

		/*JFrame frame = new JFrame();
		JPanel panel = new JPanel() ;
		panel. setBackground (Color.darkGray) ;
		JButton button = new JButton("tesuji");
		JButton buttonTwo = new JButton("watari") ;
		panel.add(button);
		frame.getContentPane().add(BorderLayout.NORTH,buttonTwo) ;
		frame.getContentPane().add (BorderLayout.EAST, panel);*/ //A=>4

		JFrame frame = new JFrame();
		JPanel panel = new JPanel() ;
		panel.setBackground (Color.darkGray) ;
		JButton button = new JButton("tesuji");
		JButton buttonTwo = new JButton("watari");
		frame.getContentPane().add(BorderLayout.SOUTH,panel) ;
		panel.add(buttonTwo);
		frame.getContentPane().add(BorderLayout.NORTH ,button) ; //E=>3

		frame.setSize(200,200);
		frame.setVisible(true);
	}
}
