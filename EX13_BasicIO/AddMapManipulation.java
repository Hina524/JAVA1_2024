import java.util.*;

public class AddMapManipulation extends ArrayManipulation{
  private int value;

  public AddMapManipulation(ArrayOperation arrayOperation, int value){
    super(arrayOperation);
    this.value = value;
  }

  public int[] operate(int[] array){
    int[] result = arrayOperation.operate(array);
    for (int i = 0; i < result.length; i++){
      result[i] += value;
    }
    return result;
  }
}
