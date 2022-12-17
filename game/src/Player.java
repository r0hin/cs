import java.awt.Color;

public class Player {

	private int x;
	private int y;
	private Map linkedMap;
	private Color color = new Color(255,0,0);
	
	public Player(int x, int y) {	
		this.x = x;
		this.y = y;
	}

	public void linkMap(Map linkedMap) {
		this.linkedMap = linkedMap;
	}
	
	public Color getColor() { return color; }
	
	public int getX() { return x; }
	public int getY() { return y; }
	
	
	public void changeX(int c) {
		x = x + c;

		if (x < 0) {
			x = 29;
			linkedMap.shiftChunk(-1, 0);
		}
		if (x > 29) {
			x = 0;
			linkedMap.shiftChunk(1, 0);
		}

		linkedMap.printCoords();
	}
	
	public void changeY(int c) {
		y = y + c;
		if (y < 0) {
			y = 29;
			linkedMap.shiftChunk(0, -1);
		}
		if (y > 29) {
			y = 0;
			linkedMap.shiftChunk(0, 1);
		}

		linkedMap.printCoords();
	}	
}
