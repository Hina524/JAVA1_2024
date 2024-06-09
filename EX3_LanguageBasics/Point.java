import java.math.*;

class Point {
  private int Px = 0;
  private int Py = 0;
  public static int X_MIN = -100; // static only OK
  public static int X_MAX = 100;
  public static int Y_MIN = -100;
  public static int Y_MAX = 100;

  public void setX(int x) { Px = x; }
  public void setY(int y) { Py = y; }
  public int getX() { return Px; }
  public int getY() { return Py; }

  public void move(int x, int y) {
    if (Math.abs(Px + x) >= X_MIN && Math.abs(Px + x) <= X_MAX && Math.abs(Py + y) >= Y_MIN && Math.abs(Py + y) <= Y_MAX) {
      Px += x;
      Py += y;
    }
  }
}