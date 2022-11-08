import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;

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
			
			for (int y = 0; y < map.getY(); y = y + 1) {
				
				for (int x = 0; x < map.getX(); x = x + 1) {
					
					if (map.getValue(x, y) == 0) {
						g.setColor(Color.GREEN);
					}

					if (map.getValue(x, y) == 1) {
						g.setColor(Color.BLUE);
					}

					if (map.getValue(x, y) == 2) {
						g.setColor(Color.GRAY);
					}
					
					g.fillRect(x*10, y*10, x*10 + 10, y * 10 + 10);
				}
			}

			g.setColor(player.getColor());
			g.fillRect(player.getX()*10, player.getY()*10, player.getX()*10 + 10, player.getY()*10 + 10);
		}	
	};
	
	private ActionListener action = new ActionListener() {
		@Override public void actionPerformed(ActionEvent e) {

			if (e.getSource() == attackBTN) {
				System.out.println("Attack");
			}
			else {
				System.out.println("ELSE");
			}

		}
	};

	private KeyListener kl = new KeyListener() {
		@Override public void keyTyped(KeyEvent e) {
			// System.out.println("Key Typed");
		}

		@Override public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			switch (keyCode) {
				case 38:
					System.out.println("UP");
					player.changeY(-1);
					break;
				case 40:
					System.out.println("DOWN");
					player.changeY(1);
					break;
				case 37:
					System.out.println("LEFT");
					player.changeX(-1);
					break;
				case 39:
					System.out.println("RIGHT");
					player.changeX(1);
					break;
				default:
					break;
			}
		}

		@Override public void keyReleased(KeyEvent e) {
			// System.out.println("Key Released");
		}
	};
	
	private Player player = new Player(0, 0);

	public GameMain() {
		
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
