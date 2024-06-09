class Square extends Rectangle {
  public Square(Point p, int width) {
    super(p, new Point(p.getX() + width, p.getY() + width));
  }
}