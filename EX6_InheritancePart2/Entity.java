abstract class Entity {
  public String name;
  public int size;

  public String getName(){ return name; }
  public void rename(String name){this.name = name; }
  abstract int getSize();
}
