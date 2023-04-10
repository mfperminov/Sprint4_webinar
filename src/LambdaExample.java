import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Samantha");
        // анонимный класс
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        // то же с лямбдой
        Collections.sort(names, (o1, o2) -> o1.length() - o2.length());

        //_________________________________________

        // анонимный класс
        List<String> filteredNames = names.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String name) {
                return name.startsWith("S");
            }
        }).collect(Collectors.toList());

        // то же с лямбдой
        List<String> filteredNamesByLambda =
            names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());

        //_________________________________________

        Function<Integer, Integer> square = (number) -> number * number;
        System.out.println(square.apply(5)); // Output: 25
    }
}