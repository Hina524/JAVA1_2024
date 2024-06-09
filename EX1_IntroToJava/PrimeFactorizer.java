import java.util.Scanner;

class PrimeFactorizer {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(n + ":");

    for(int i=2; i<=n; i++){
      while (n%i == 0) {
        System.out.print(" "+ i);
        n /= i;
      }
    }

    if(n != 1){
      System.out.print(n);
    }
  }
}