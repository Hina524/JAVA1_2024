public class Point implements Relatable {
  private int x, y;

  public boolean isSmallerThan(Relatable other){
    Point OPoint = (Point) other;
    if(x < OPoint.x){
      return true;
    } else if(x == OPoint.x && y < OPoint.y){
      return true;
    } else {
      return false;
    }
  }
  public Point(){};
  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public int getX(){ return x; }

  public int getY(){ return y; }

  public void print(){
    System.out.println("(" + x + ", " + y + ")");
  }
}
