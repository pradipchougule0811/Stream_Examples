package My.pack;

import java.util.Locale;
import java.util.stream.Stream;

public class StreamMapExample
{
    public static void main(String[] args) {
        Stream<String> s =Stream.of("Arun", "Kiran", "Vijay" ,"Varun","Viraj");
        s.map(e-> e.toUpperCase(Locale.ROOT)).forEach(System.out::println);
    }
}
