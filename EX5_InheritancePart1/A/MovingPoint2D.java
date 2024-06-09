public class MovingPoint2D extends Point2D{
  double vx, vy;
  public void setVelocity(double a, double b){
    this.vx = a;
    this.vy = b;
  }

  public void move(){
    Px += vx;
    Py += vy;
  }

  public MovingPoint2D(double x, double y, double vx, double vy){
    Px = x;
    Py = y;
    this.vx = vx;
    this.vy = vy;
  }
}
