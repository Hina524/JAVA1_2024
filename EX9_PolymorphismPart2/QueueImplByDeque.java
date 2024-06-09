public class QueueImplByDeque implements Queue{
  Deque deque;

  QueueImplByDeque(){
    this.deque = new DequeImplByDLL();
  }

  public void enqueue(int x){ deque.insertBack(x); }

  public int dequeue(){
    int cur = deque.front();
    deque.removeFront();
    return cur;
  }

  public int front(){ return deque.front(); }
  public int size(){ return deque.size(); }
  public boolean empty(){ return deque.empty(); }
}
