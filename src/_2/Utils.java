package _2;

public class Utils {
  public static <T> boolean isEqual(T a, T b) {
    return a.equals(b);
  }

  public static void main(String[] args) {
    boolean stringEqual = Utils.<String>isEqual("Hello", "World");
    System.out.println(stringEqual);
    boolean intEqual = Utils.<Integer>isEqual(42, 42);
    System.out.println(stringEqual);
  }
}
