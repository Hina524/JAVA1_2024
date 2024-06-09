public class Queue implements OpenList{
  int[] a = new int[100];
  int head = 0;
  int tail = 0;

  public boolean isEmpty(){
    return head == tail;
  }

  public void push(int N) {
    a[tail] = N;
    tail++;
  }

  public int pop(){
    int temp = a[head];
    head++;
    return temp;
  }
}
