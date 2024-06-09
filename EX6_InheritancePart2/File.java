public class File extends Entity{
  public File(String name, int size){
    this.name = name;
    this.size = size;
  }

  public String getName(){ return this.name; }
  public void rename(String name){this.name = name; }
  public int getSize(){ return this.size; }
}