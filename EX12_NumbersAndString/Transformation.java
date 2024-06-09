import java.util.Scanner;

public class Transformation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder(sc.nextLine());

    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      String com = sc.next();
      int a = sc.nextInt();
      int b = sc.nextInt();
      if (com.equals("print")) {
        System.out.println(str.substring(a, b + 1));
      } else if (com.equals("replace")) {
        String p = sc.next();
        str.replace(a, b + 1, p);
      } else {
        String substr = str.substring(a, b + 1);
        str.replace(a, b + 1, new StringBuilder(substr).reverse().toString());
      }
    }
    sc.close();
  }
}
