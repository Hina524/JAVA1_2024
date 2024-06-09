public class SortingMachine {

  public void sort(Relatable[] p){
    for ( int i = 0; i < p.length; i++ ) {
      for ( int j = i + 1; j < p.length; j++ ) {
        if ( p[j].isSmallerThan(p[i]) ) {
          Relatable temp = p[i];
          p[i] = p[j];
          p[j] = temp;
        }
      }
    }
  }
}