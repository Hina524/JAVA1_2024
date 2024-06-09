public class ComputeInitials {
  public static void main(String[] args) {

    String initials = "";
    String name = args[0];
    String[] parts = name.split(" ");

    for (String part : parts) {
      if (!part.isEmpty()) {
        initials += part.charAt(0);
      }
    }
    System.out.println("My initials are: " + initials);
  }
}