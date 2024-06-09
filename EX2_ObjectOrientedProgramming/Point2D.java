public class Point2D {
  private double Px = 0;
  private double Py = 0;

  public void setX(double x){Px = x;}
  public void setY(double y){Py = y;}
  public double getX(){return Px;}
  public double getY(){return Py;}
  public double length(){return Math.sqrt((Px*Px) + (Py*Py));}
  public double dotProduct(Point2D v){return Px*v.Px + Py*v.Py;}
  public double crossProduct(Point2D v){return Px*v.Py - Py*v.Px;}
  public void add(Point2D v){
    Px += v.Px;
    Py += v.Py;
  }
  public void scale(double s){
    Px *= s;
    Py *= s;
  }
}
