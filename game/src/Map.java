import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class Map {
	private int chunkX; // Chunk coordinates
	private int chunkY;
	private Player linkedPlayer; // For printCoords()
	private int[][] map; // Currently active chunk
	
	public Map() { // Constructor, default chunk (0, 0)
		chunkX = 0;
		chunkY = 0;
		// Load chunk (0, 0)
		getChunk(chunkX, chunkY);
	}

	public void linkPlayer(Player player) {
		// Link player to map
		this.linkedPlayer = player;
	}

	public void printCoords() {
		// Print player coordinates in map
		int newX = chunkX * 30 + linkedPlayer.getX();
		int newY = chunkY * 30 + linkedPlayer.getY();
		System.out.println("New coordinate: " + newX + ", " + newY);
	}

	public void shiftChunk(int dX, int dY) {
		// Given a shift in x and y, shift chunk
		chunkX = chunkX + dX;
		chunkY = chunkY + dY;
		// Load new chunk
		getChunk(chunkX, chunkY);
	}

	private void saveChunk(int x, int y) {
		// Get file
		File f = new File("map/" + x + "_" + y + ".map");
		try {
			// Make sure directory and file exists
			f.getParentFile().mkdirs();
			f.createNewFile();
		} catch (Exception e) {
			// Print to console if error
			System.out.println(e.getMessage());
		}

		try {
			// New FileWriter 
			FileWriter fw = new FileWriter("map/" + x + "_" + y + ".map");

			fw.write(this.toString());
			fw.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}
	
	private int[][] getChunk(int x, int y) {
		// Load 2d array from file, create if not exist

		File f = new File("map/" + x + "_" + y + ".map");

		if (f.exists()) {
			// Load from file

			try {
				FileReader fr = new FileReader(f);
				String s = "";
				int c = fr.read();
				while (c != -1) {
					s = s + (char)c;
					c = fr.read();
				}
				fr.close();

				// Parse string to 2d array
				String[] lines = s.split("\n");
				int[][] arr = new int[lines.length][lines[0].length()];
				for (int i = 0; i < lines.length; i = i + 1) {
					for (int j = 0; j < lines[i].length(); j = j + 1) {
						arr[i][j] = Integer.parseInt(lines[i].substring(j, j+1));
					}
				}

				map = arr;
				return map;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}


			return null;
		} else {

			generateMap();
			saveChunk(x, y);

			return map;
		}
	}
	
	public int getY() { return map.length; }
	public int getX() { 
		try {
			
		
			return map[0].length; 
		
		} catch (Exception e) {
			
			return -1;
		
		}
	}
	public int getValue(int x, int y) { return map[y][x]; } 
	/**
	 * 
	 * @param n
	 * @return
	 */
	
	public void generateMap() {

		map = new int[30][30];
	
		//Approach 1:
		for (int x = 0; x < 30; x = x + 1) {
			
			for (int y = 0; y < 30; y = y + 1) {
				
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
