import java.util.Scanner;

class Ring{
  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    s = s+s;
    for(int i = 0; i < s.length()/2; i++){
      if(s.substring(i,i+t.length()).equals(t)){
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
