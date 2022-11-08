import java.awt.Color;

public class Player {
  private int x = 0;
  private int y = 0;
  private Color color = new Color(255, 0, 0);

  public Player(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void changeX(int x) {
    this.x = this.x + x;
  }

  public void changeY(int y) {
    this.y = this.y + y;
  }

  public Color getColor() { return color; }
  public int getX() { return x; }
  public int getY() { return y; }
}
