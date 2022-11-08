import java.awt.Color;

public class Map extends Object{

	private int[][] map;
	private int range;
	private Color[] colors;
	
	public Map(int x, int y) {
		
		
		
		colors = new Color[2];
		colors[0] = Color.BLACK;
		colors[1] = Color.GRAY;
				
		map = new int[y][x];
		
		generateCaveSystem(); 
		
	}
	
	public int getY() { return map.length; }
	public int getX() { 
		
		try {
			
		
			return map[0].length; 
		
		} catch (Exception e) {
			
			return -1;
		
		}
	}
	public Color getColor(int x, int y) { return colors[map[y][x]]; }
	
	public int getValue(int x, int y) { return map[y][x]; } 
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int[] generate1DList(int n, int r) {
		
		
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i = i + 1) {
			arr[i] = (int)(Math.random()*r);
		}
		
		
		return arr;
	}
	
	/**
	 * This method generates a randomized cave system by
	 * randomly selecting a location in the 2D map array
	 * and then creating a path through it of valid elements
	 * and setting the position to "empty space".  It does
	 * this a number of times creating randomized cave system.
	 * 
	 * Often this cave system is fully connected, however, this 
	 * is not always the case.  An interesting next step would be
	 * to think about how we guarantee a fully connected cave system.
	 * 
	 * Think about how you can set up parameters to allow
	 * the user to pass arguments that help give more 
	 * flexibility in the design. 
	 */
	public void generateCaveSystem() {
		
		//This stores our possible directions as an array
		//in this example we can only go up down, left or
		//right.  But if diagonal was an option you woudl
		//add that to the dir array and then it minimizes
		//other updates. 
		int[][] dir = 	{	{-1,0},
						 	{0,1},
						 	{1,0},
						 	{0,-1}
						};
		
		//This is the number of independent tunnels we want
		//the program to generate.  The program will
		//pick numTunnels random starting points and apply
		//the algorithm. 
		int numTunnels = 10;
		
		//We are going to populate array with all 1, which
		//indicates solid rock - we are applying a standard
		//nested loop structure to traverse a 2D array.
		for (int y = 0; y < map.length; y = y + 1) {
			
			for (int x = 0; x < map[y].length; x = x + 1) {
			
				map[y][x] = 1;
				
				
			}
		}

		//Next we run the tunnel generation component
		//numTunnels times. The higher the number the more
		//independent tunnels that are generated
		for (int i = 0; i < numTunnels; i = i + 1) {
			
			//Generate a random starting point
			//Option: We could add some logic here to 
			//ensure the starting point is always solid rock
			//-1
			int ry = (int)(Math.random()*map.length);
			int rx = (int)(Math.random()*map[0].length);
			
			//stores the real "head" position of the tunnel being 
			//generated
			int[] position = {ry,rx};
			
			//We can modify the length of the tunnel here 
			//Option: Make this random each time.
			int tunnelLength = 100;
			
			//We are going to clear tunnel Length bricks. It means
			//we are going to take 100 steps through the array and 
			//set the element to 0 which means there is no rock 
			//anymore
			for (int j = 0; j < tunnelLength; j = j + 1) {
				
				//We need to check if the next position is valid
				//as a starting place we will assume it is not. 
				boolean valid = false; //assume invalid
				
				//This loop ensures that we find a valid next 
				//position
				while (valid == false) {
					//Generate random direction
					int r = (int)(Math.random()*dir.length);
					
					//generate a next possible location in the 
					//map array to move. 
					int ny = ry + dir[r][0];
					int nx = rx + dir[r][1];
					
					//check if position is valid
					if (nx >= 0 && nx < map.length) {
						if (ny >= 0 && ny < map[0].length) {
							//if it is valid we 
							valid = true; //set valid to true to exit the while loop
							ry = ny; //set new real head position y
							rx = nx; //set new real head position x
							map[rx][ry] = 0; //turn the new head position into a tunnel
						}
					}
				}
			}
		
		
		}
		
		
		
	}
	public void generateMap() {
	
		//Approach 1:
		for (int x = 0; x < map.length; x = x + 1) {
			
			for (int y = 0; y < map[x].length; y = y + 1) {
				
				int r = (int)(Math.random()*100);
				
				if (r < 65) {
					map[x][y] = 0;
				}
				else if (r < 90) {
					map[x][y] = 1;
						
				}
				else {
					map[x][y] = 2;
					
				}
				
			}
	}
		
		
		//Approach 2: 
		
		//for (int x = 0; x < map.length; x = x + 1) {
		
//			map[x] = generate1DList(map[x].length, range);
			
//		}
		
		
	
		
		
	}
	
	
	public String toString() {
		
		//String construction
		String result = "";
		for (int x = 0; x < map.length; x = x + 1) {
			for (int y = 0; y < map[x].length; y = y + 1) {
				result = result + map[x][y];
				
			}
			result = result + "\n";
		}
		return result;
	}	
}