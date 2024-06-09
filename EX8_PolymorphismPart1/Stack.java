public class Stack implements OpenList{
  int[] a = new int[100];
  int top = 0;

  public boolean isEmpty(){
    return top == 0;
  }

  public void push(int N) {
    a[top] = N;
    top++;
  }

  public int pop(){
    top--;
    return a[top];
  }
}
