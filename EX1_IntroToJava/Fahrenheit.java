import java.util.Scanner; // API to use the Scanner object

class Fahrenheit{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in); // A reference to a Scanner object
    double F = sc.nextInt(); // read an integer from the std. input
    double C = (F - 32) * 5 / 9; // convert Fahrenheit to Celsius
    System.out.println(C); // print the result
  }
}