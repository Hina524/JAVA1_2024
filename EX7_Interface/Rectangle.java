import java.lang.Math;

public class Rectangle extends Point{
  public Point p1, p3;

  public boolean isSmallerThan(Relatable other){
    Rectangle ORectangle = (Rectangle) other;
    if(getArea() < ORectangle.getArea()){
      return true;
    } else {
      return false;
    }
  }

  public Rectangle(Point p1, Point p3){
    super(p1.getX(), p1.getY());
    this.p1 = p1;
    this.p3 = p3;
  }

  public int getArea(){
    return Math.abs((p1.getX() - p3.getX()) * (p1.getY() - p3.getY()));
  }
}
