class DequeImplByDLL implements Deque{
  private SimpleDoublyLinkedList list;
  private int n; // the number of elements in the deque

  DequeImplByDLL(){
    list = new SimpleDoublyLinkedList();
    n = 0;
  }

  public void insertFront(int x){
    list.addFront(x);
    n++;
  }

  public void insertBack(int x){
    list.addBack(x);
    n++;
  }

  public void removeFront(){
    if (n == 0){ return; }
    list.removeFront();
    n--;
  }

  public void removeBack(){
    if (n == 0){ return; }
    list.removeBack();
    n--;
  }

  public int front(){
    if (n == 0){ return -1; }
    return list.front();
  }

  public int back(){
    if (n == 0){ return -1; }
    return list.back();
  }

  public int size(){ return n; }

  public boolean empty(){ return n == 0; }
}