public class MovingPoint2D{
  Point2D p = new Point2D();
  double vx, vy;

  public void setVelocity(double a, double b){
    this.vx = a;
    this.vy = b;
  }

  public void move(){
    p.Px += vx;
    p.Py += vy;
  }

  public double distance(MovingPoint2D other){ return p.distance(other.p);}
  public String toString(){ return p.toString();}

  public MovingPoint2D(double x, double y, double vx, double vy){
    p.Px = x;
    p.Py = y;
    this.vx = vx;
    this.vy = vy;
  }
}