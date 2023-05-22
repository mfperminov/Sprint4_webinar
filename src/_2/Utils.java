package _2;

public class Utils {
  public static <T> boolean isEqual(T a, T b) {
    return a.equals(b);
  }

  public static void main(String[] args) {
    boolean stringEqual = Utils.isEqual("Hello", "world");
    System.out.println(stringEqual);
    boolean intEqual = Utils.isEqual(42, 42);
    System.out.println(intEqual);
  }
}
