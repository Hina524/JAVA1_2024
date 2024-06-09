import java.util.*;

public class ShuffleManipulation extends ArrayManipulation{
  public ShuffleManipulation(ArrayOperation arrayOperation){
    super(arrayOperation);
  }

  public int[] operate(int[] array){      int[] result = arrayOperation.operate(array);
    for (int i = 0; i < result.length; i++){
      int randomIndex = (int)(Math.random() * result.length);
      int temp = result[i];
      result[i] = result[randomIndex];
      result[randomIndex] = temp;
    }
    return result;
  }
}
