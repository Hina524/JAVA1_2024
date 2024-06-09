class Quadrangle extends Shape {
  protected Point[] P;

  public Quadrangle(Point p1, Point p2, Point p3, Point p4){
    P = new Point[]{p1, p2, p3, p4};
  }

  public void print() {
    super.print();
    for (int i = 0; i < P.length; i++) {
      System.out.print("(" + P[i].getX() + ", " + P[i].getY() + ")");
      if (i != P.length - 1) {
          System.out.print("-");
      }
    }
    System.out.println();
  }

  public void move(int dx, int dy){
    for (Point point : P) {
      point.move(dx, dy);
    }
  }
}