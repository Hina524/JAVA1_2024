public class Adder {
  static int num = 0;

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      num += Integer.parseInt(args[i]);
    }
    System.out.println(num);
  }
}
