import java.io.*;

public class ListOfNumbers {
  private static final int SIZE = 10;
  private int[] vector;

  public ListOfNumbers () {
    vector = new int[SIZE];
    for (int i = 0; i < SIZE; i++) vector[i] = i;
  }

  public void writeList() {
    try {
      System.out.println("Entering try block");
      for (int i = 0; i <= SIZE; i++){
        if(i >= SIZE) throw new ArrayIndexOutOfBoundsException("ArrayIndexOutOfBoundsException: " + i);
        System.out.println("Value at: " + i + " = " + vector[i]);
      }
    } catch (Exception e) {
      System.out.println("Entering catch block");
      System.out.println("Caught " + e.getMessage());
    } finally {
      System.out.println("Entering finally block");
    }
}

  public static void main(String[] args){
    ListOfNumbers l = new ListOfNumbers();
    l.writeList();
  }
}