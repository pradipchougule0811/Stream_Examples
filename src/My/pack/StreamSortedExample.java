package My.pack;

import java.util.stream.Stream;

public class StreamSortedExample
{
    public static void main(String[] args) {
        Stream<Integer> s  = Stream.of(45,23,78,3,25,87,34);
        s.sorted().forEach(System.out::println);
    }
}
