package _2;

public class MathUtils {
  public static <T extends Number> double average(T[] numbers) {
    double sum = 0.0;
    for (T number : numbers) {
      sum += number.doubleValue();
    }
    return sum / numbers.length;
  }

  public static void main(String[] args) {
    Double[] doubles = {1.0, 2.0, 3.0};
    double doubleAvg = MathUtils.average(doubles);
    System.out.println(doubleAvg);

    Integer[] integers = {1, 2, 3};
    double intAvg = MathUtils.average(integers);
    System.out.println(intAvg);
  }
}
