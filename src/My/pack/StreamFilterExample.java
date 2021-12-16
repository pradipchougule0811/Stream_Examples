package My.pack;

import java.util.stream.Stream;

public class StreamFilterExample
{
    public static void main(String[] args) {
        Stream<String> s =Stream.of("Arun", "Kiran", "Vijay" ,"Varun");
        s.filter(e->e.startsWith("V")).forEach(System.out::println);
    }
}
