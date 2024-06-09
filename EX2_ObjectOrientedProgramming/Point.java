import java.math.*;

class Point {
  private int Px = 0;
  private int Py = 0;

  public void setX(int x){Px = x;}
  public void setY(int y){Py = y;}
  public int getX(){return Px;}
  public int getY(){return Py;}
  public void move(int x, int y){
    if(Math.abs(Px+x)<=100 && Math.abs(Py+y)<=100){
      Px += x;
      Py += y;
    }
  }
}