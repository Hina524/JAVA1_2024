class Point{
  private int x;
  private int y;

  public Point(int x, int y){
    this.x = x;
    this.y = y;
  }

  public Point(){}

  public boolean equals(Object o){
    if (this == o){ return true; }
    if (o == null || !( o instanceof Point )){ return false; }

    Point point = (Point) o;
    return x == point.x && y == point.y;
  }

  public int getX(){ return x; }
  public int getY(){ return y; }
  public void move(int dx, int dy) {
    x += dx;
    y += dy;
  }
}