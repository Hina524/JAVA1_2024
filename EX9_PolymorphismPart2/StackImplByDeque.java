class StackImplByDeque implements Stack {
  private Deque deque;

  StackImplByDeque(){
    this.deque = new DequeImplByDLL();
  }

  public void push(int x){ deque.insertFront(x); }

  public int pop(){
    int cur = deque.front();
    deque.removeFront();
    return cur;
  }

  public int top(){ return deque.front(); }
  public int size(){ return deque.size(); }
  public boolean empty(){ return deque.empty(); }
}