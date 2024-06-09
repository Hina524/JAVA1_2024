public class Stack implements Container {
  int[] a;
  int top;
  int n;

  public Stack(int n){
    this.n = n;
    a = new int[n];
    top = -1;
  }

  void push(int x){
    top++;
    a[top] = x;
  }

  int pop(){
    int con = a[top];
    top--;
    return con;
  }

  public int size(){
    return top + 1;
  }

  public boolean isEmpty(){
    return top == -1;
  }

  public boolean isFull(){
    return top == a.length - 1;
  }
}
