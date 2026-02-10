import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args){

        // Creating a Stream of strings
        Stream<String> stream = Stream.of("Java", "Python", "C++", "JavaScript");

        // Iterating through the stream using forEach
        stream.forEach(element -> System.out.println(element));

    }
}
