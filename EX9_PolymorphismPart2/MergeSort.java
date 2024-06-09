public class MergeSort implements Strategy{

  public void sort(int[] data){
    mergeSort(data, 0, data.length-1);
  }

  private void mergeSort(int[] data, int left, int right){
    if (left < right){
      int middle = (left + right) / 2;
      mergeSort(data, left, middle);
      mergeSort(data, middle+1, right);
      merge(data, left, middle, right);
    }
  }

  private void merge(int[] data, int left, int middle, int right){
    int n1 = middle - left + 1;
    int n2 = right - middle;

    int[] L = new int[n1];
    int[] R = new int[n2];

    for (int i = 0; i < n1; i++){
      L[i] = data[left + i];
    }
    for (int j = 0; j < n2; j++){
      R[j] = data[middle + 1 + j];
    }

    int i = 0, j = 0;
    int k = left;
    while (i < n1 && j < n2){
      if (L[i] <= R[j]){
        data[k] = L[i];
        i++;
      } else {
        data[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1){
      data[k] = L[i];
      i++;
      k++;
    }

    while (j < n2){
      data[k] = R[j];
      j++;
      k++;
    }
  }
}
