
public class Map extends Object{

	private int[][] map;
	private int range;
	
	public Map(int x, int y) {
		
		range = 3;
		map = new int[y][x];
		
		generateMap(); 
		
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
	
		//Approach 1:
//		for (int x = 0; x < map.length; x = x + 1) {
//			
//			for (int y = 0; y < map[x].length; y = y + 1) {
//				
//				int r = (int)(Math.random()*range);
//				map[x][y] = r;
//				
//			}
//		}
//		
		
		//Approach 2: 
		
		for (int x = 0; x < map.length; x = x + 1) {

			map[x] = generate1DList(map[x].length, range);

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
