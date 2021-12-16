package My.pack;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamCountExample
{
    public static void main(String[] args) {

        Stream<String> s3 =Stream.of("Arun", "Kiran", "Vijay" ,"Varun","Viraj");
        long r3 = s3.filter(e->e.length()==5).count();
        System.out.println(r3);
        //Reduced Example
        Stream<String> s4 =Stream.of("Arun", "Kiran", "Vijay" ,"Varun","Viraj");
        Optional<String> reduced = s4.reduce((s1,s2) -> s1 + "#" + s2);
        reduced.ifPresent(System.out::println);
    }
}
