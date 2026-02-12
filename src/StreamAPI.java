import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Optional;
import java.util.Comparator;

public class StreamAPI {
    public static void main(String[] args){

        // Creating a Stream of strings
        Stream<String> stream = Stream.of("Java", "Python", "C++", "JavaScript");

        stream.forEach(System.out::println);

        // Original list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Double values
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("\nDoubled Values:");
        doubledNumbers.forEach(System.out::println);

        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("\nEven Numbers:");
        evenNumbers.forEach(System.out::println);

        // Find first even number
        Optional<Integer> firstEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

        System.out.println("\nFirst Even Number:");
        firstEven.ifPresent(System.out::println);

        // Find minimum even number
        Optional<Integer> minEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .min(Comparator.naturalOrder());

        System.out.println("\nMinimum Even Number:");
        minEven.ifPresent(System.out::println);

        // Find maximum even number
        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Comparator.naturalOrder());

        System.out.println("\nMaximum Even Number:");
        maxEven.ifPresent(System.out::println);
    }
}
