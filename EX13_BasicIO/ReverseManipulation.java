import java.util.Arrays;

public class ReverseManipulation extends ArrayManipulation{
  public ReverseManipulation(ArrayOperation arrayOperation){
    super(arrayOperation);
  }

  public int[] operate(int[] array){
    int[] result = arrayOperation.operate(array);
    int[] reversed = new int[result.length];
    for (int i = 0; i < result.length; i++){
      reversed[i] = result[result.length - 1 - i];
    }
    return reversed;
  }
}
