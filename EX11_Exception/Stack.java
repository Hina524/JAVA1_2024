public class Stack implements OpenList {
    int[] a;
    int top;
    int maxSize;

    public Stack(int size) {
        this.a = new int[size];
        this.top = 0;
        this.maxSize = size;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void push(int N) throws StackOverflowException {
        if (top >= maxSize) {
            throw new StackOverflowException("Overflow. " + N + " can not be pushed.");
        }
        a[top] = N;
        top++;
    }

    public int pop() throws StackUnderflowException {
        if (isEmpty()) {
            throw new StackUnderflowException("Underflow. There is no element in the stack.");
        }
        top--;
        return a[top];
    }
}
