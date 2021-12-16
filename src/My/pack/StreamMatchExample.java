package My.pack;

import java.util.stream.Stream;

public class StreamMatchExample
{
    public static void main(String[] args) {
        Stream<String> s =Stream.of("Arun", "Kiran", "Vijay" ,"Varun","Viraj");
        Boolean r = s.anyMatch(e->e.startsWith("Z"));
        System.out.println(r);

        Stream<String> s1 =Stream.of("Arun", "Kiran", "Vijay" ,"Varun","Viraj");
        Boolean r1 = s1.allMatch(e->e.startsWith("A"));
        System.out.println(r1);

        Stream<String> s2 =Stream.of("Arun", "Kiran", "Vijay" ,"Varun","Viraj");
        Boolean r2 = s2.noneMatch(e->e.startsWith("A"));
        System.out.println(r2);
    }
}
