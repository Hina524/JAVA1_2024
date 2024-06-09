public class MInt extends Int{
  public int MOD = 107;

  public MInt(int a){ super(a); }
  public MInt(){}
  public MInt add(Int a){
    MInt b = new MInt();
    b.setValue((a.getValue() + x) % MOD);
    return b;
  }
  public MInt mul(Int a){
    MInt b = new MInt();
    b.setValue((a.getValue() * x) % MOD);
    return b;
  }
}
