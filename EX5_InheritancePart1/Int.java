public class Int {
  public int x;
  public int INT_MAX = 1024;

  public Int(int a){ x = a; }
  public Int(){}
  public Int add(Int a){
    Int b = new Int();
    b.setValue(a.getValue() + x);
    return b;
  }
  public Int mul(Int a){
    Int b = new Int();
    b.setValue(a.getValue() * x);
    return b;
  }
  public void setValue(int a){ x = a; }
  public int getValue(){ return x; }
  public String toString(){ return Integer.toString(x);}
}