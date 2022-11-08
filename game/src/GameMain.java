import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.print.attribute.standard.PagesPerMinuteColor;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;

public class GameMain extends Object {
	
	//Build the GUI Components
	private JFrame frame;
	private JPanel panel;
	
	
	private JButton attackBTN;
	private JButton magicBTN;
	private JButton defendBTN;
	
	//Data Component
	private Map map;

	private JPanel canvas = new JPanel() {
		
		public void paintComponent (Graphics g) {
		
			super.paintComponent(g);
			g.setColor(Color.RED);
			
			/*
			 * 
			 * This is a better approach now since the color selection
			 * is contained within the Map class, which from a design 
			 * perspective is much better. 
			 * 
			 */
			for (int y = 0; y < map.getY(); y = y + 1) {
				
				for (int x = 0; x < map.getX(); x = x + 1) {
					
					Color c = map.getColor(x,y);
					g.setColor(c);
					g.fillRect(x*10,y*10,x*10 + 10,y * 10 + 10);
				}
			}
			
			
			
		
		}	
		
	};
	
	private ActionListener action = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println("ACTION");
			//WHO CLICKED?
			//e.getSource - gets the source of who was clicked
			//System.out.println(e.getSource() == attackBTN);
		}
		
		
	};
	
	private KeyListener kl = new KeyListener() {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println(e.getKeyCode());
			int keyCode = e.getKeyCode();
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Pressed");
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Released");
		}
		
		
		
	};
	
	
	
	
	public GameMain() {
		System.out.println("GAME_MAIN_1");
		System.out.println("MISKEW_MOD");
		
		//Construct Data Elements
		map = new Map(30,30);
		System.out.println(map);
				
				
				
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
		attackBTN.addActionListener(action);
		
		magicBTN.setBounds(5,35,100,30);
		magicBTN.addActionListener(action);
		
		defendBTN.setBounds(5,65,100,30);
		defendBTN.addActionListener(action);
		
		canvas.setBounds(105,5,300,300);
		
		//Add the objects/widgets to the screen
		panel.add(attackBTN);
		panel.add(magicBTN);
		panel.add(defendBTN);
		panel.add(canvas);
		
		
		panel.setFocusable(true);
	    panel.requestFocus();
	 	panel.addKeyListener(kl);
	 	
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