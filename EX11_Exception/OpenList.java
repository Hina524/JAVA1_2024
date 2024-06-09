public interface OpenList{
  boolean isEmpty();
  void push(int N) throws StackOverflowException;
  int pop() throws StackUnderflowException;
}