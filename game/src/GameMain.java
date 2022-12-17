import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

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
			
			for (int y = 0; y < map.getY(); y = y + 1) {
				
				for (int x = 0; x < map.getX(); x = x + 1) {
					
					if (map.getValue(x,y) == 0) {
						g.setColor(Color.GREEN);
					}
					if (map.getValue(x,y) == 1) {
						g.setColor(Color.BLUE);
					}
					if (map.getValue(x,y) == 2) {
						g.setColor(Color.GRAY);
					}
					
					g.fillRect(x*10,y*10,10,10);
				}
			}
			
			g.setColor(player.getColor());
			

			g.fillRect(player.getX()*10,player.getY()*10,10,10);
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
		
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int keyCode = e.getKeyCode();
			
			if (keyCode == 38) {
				player.changeY(-1);
				
			}
			else if (keyCode == 39){
				player.changeX(1);
			}
			else if (keyCode == 40) {
				player.changeY(1);
			}
			else if (keyCode == 37) {
				player.changeX(-1);
			}
			
			panel.repaint();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		}
		
		
		
	};
	
	private Player player = new Player(2, 1);
	
	
	public GameMain() {

		//Construct Data Elements
		map = new Map();
		player.linkMap(map);
		map.linkPlayer(player);
				
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
		
		
		// Authenticate user

		File f = new File("user.txt");
		String username;
		String password;

		if (f.exists()) {
			try {
				FileReader fr = new FileReader(f);
				String credentials = "";
				int c = fr.read();
				while (c != -1) {
					credentials = credentials + (char) c;
					c = fr.read();
				}

				username = credentials.split(" ")[0];
				password = credentials.split(" ")[1];			
				
				System.out.println("Welcome user! " + username);

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter password: ");
				String input = sc.nextLine();

				if (input.equals(password)) {
					System.out.println("Welcome user! " + username);
				}
				else {
					System.out.println("Incorrect password");
					System.exit(0);
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		else {

			System.out.println("Welcome new user! Please create account: ");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter username: ");
			username = sc.nextLine();
			System.out.println("Enter password: ");
			password = sc.nextLine();

			try {
				FileWriter fw = new FileWriter(f);
				fw.write(username + " " + password);
				fw.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		GameMain gm = new GameMain();
		
	}

}
