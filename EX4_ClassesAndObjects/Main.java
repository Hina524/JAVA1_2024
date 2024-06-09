import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GasStation gas = new GasStation();

    gas.setN(sc.nextInt());
    gas.setM(sc.nextInt());

    for (int i = 0; i < gas.M; i++) {
      int com = sc.nextInt();
      int num = sc.nextInt();

      if (com == 0) {
        gas.pop(num);
      } else {
        gas.push(num);
      }
    }
  }
}

class GasStation {
  int N; // number of line
  int M; // number of command
  boolean flag = false;
  int[][] status;

  void setN(int N) {
    this.N = N;
    status = new int[N][10000];
  }

  void setM(int M) {
    this.M = M;
  }

  void push(int num){
    for(int i = 0; i < 10000; i++){
      for(int j = 0; j < N; j++){
        if(status[j][i] == 0){
          status[j][i] = num;
          flag = true;
          break;
        }
      }
      if(flag){
        flag = false;
        break;
      }
    }
  }

  void pop(int num) {
    System.out.println(status[num - 1][0]);
    status[num - 1][0] = 0;

    for (int i = 1; i < 10000; i++) {
      if (status[num - 1][i] == 0)
        break;
      status[num - 1][i - 1] = status[num - 1][i];
      status[num - 1][i] = 0;
    }
  }
}