import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args){

        // Creating a Stream of strings
        Stream<String> stream = Stream.of("Java", "Python", "C++", "JavaScript");

        // Iterating through the stream using forEach
        stream.forEach(element -> System.out.println(element));

        // Original list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Transform each element to double its value
        List<Integer> doubledNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        // Display result
        System.out.println("Doubled Values:");
        doubledNumbers.forEach(System.out::println);
        // Transform each element to double and collect into a new list
        List<Integer> doubledList = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

        // Display the new list
        System.out.println("\nNew List with Doubled Values:");
        doubledList.forEach(System.out::println);
    }
}
