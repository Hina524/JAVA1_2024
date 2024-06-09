class Circle extends Shape {
  protected Point center;
  protected int radius;

  public Circle(Point center, int radius) {
    this.center = center;
    this.radius = radius;
  }

  public void print() {
    super.print();
    System.out.println("(" + center.getX() + ", " + center.getY() + ") radius = " + radius);
  }

  public void move(int dx, int dy) {
    center.move(dx, dy);
  }
}