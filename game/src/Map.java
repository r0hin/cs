
public class Map extends Object{

	private int[][] map;
	private int range;
	
	public Map(int x, int y) {
		
		range = 3;
		map = new int[y][x];
		
		generateMap(); 
		
	}
	
	public int getY() { return map.length; }
	
	
	public int getX() { 
		
		try {
			
		
			return map[0].length; 
		
		} catch (Exception e) {
			
			return -1;
		
		}
	}
	
	public int getValue(int x, int y) {
		return map[y][x];
	}
	
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
	
	public void generateMap() {
		for (int x = 0; x < map.length; x = x + 1) {
			for (int y = 0; y < map[x].length; y = y + 1) {
				int r = (int)(Math.random()*100);
				if (r < 50) {
					map[x][y] = 2;
				}
				else if (r < 75) {
					map[x][y] = 1;
				}
				else {
					map[x][y] = 0;
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write some test code here:
		//Construct a new map object
		Map testMap = new Map(4,3);
		System.out.println(testMap.toString());
		
		
		//Output the map to console. 
		
		
		
		
		
		
		

	}

}
