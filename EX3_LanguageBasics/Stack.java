public class Stack {
  int[] a = new int[100];
  int top = 0;

  void push(int x) {
    a[top] = x;
    top++;
  }

  void pop(){
    top--;
    System.out.println(a[top]);
  }
}
