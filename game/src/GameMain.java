import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class GameMain {
	
	//Build the GUI Components
	private JFrame frame;
	private JPanel panel;
	
	
	private JButton attackBTN;
	private JButton magicBTN;
	private JButton defendBTN;

	private JPanel canvas = new JPanel() {
		
		public void paintComponent (Graphics g) {
		
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(0,0,300,300);
		
		
		}	
		
	};
	
	
	public GameMain() {
		
		//Construct Graphic Elements
		frame = new JFrame();
		panel = new JPanel();
		
		attackBTN = new JButton("Attack");
		magicBTN = new JButton("Magic");
		defendBTN = new JButton("Defend");
		
		
		//Setup and Display Graphic Elements
		
		
		
		
		panel.setPreferredSize(new Dimension(500,500));
		panel.setLayout(null); //when I set the layout to null I have full control
		
		//setBounds(x,y,width,heigh);
		attackBTN.setBounds(5,5,100,30);
		magicBTN.setBounds(5,35,100,30);
		defendBTN.setBounds(5,65,100,30);
		canvas.setBounds(105,5,300,300);
		
		panel.add(attackBTN);
		panel.add(magicBTN);
		panel.add(defendBTN);
		panel.add(canvas);
		
		
		frame.add(panel); //This adds the panel to the frame. 
		frame.setResizable(false);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameMain gm = new GameMain();
		
	}

}
