public class SimpleNode {
  public int key;
  public SimpleNode next, prev;

  public void setNext(SimpleNode N){
    this.next = N;
  }

  public void setPrev(SimpleNode P){
    this.prev = P;
  }

  public void setKey(int key){
    this.key = key;
  }

  public int getKey(){
    return this.key;
  }

  public SimpleNode getNext(){
    return this.next;
  }

  public SimpleNode getPrev(){
    return this.prev;
  }
}