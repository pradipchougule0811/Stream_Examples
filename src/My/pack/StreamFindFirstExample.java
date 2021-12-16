package My.pack;

import java.util.stream.Stream;

public class StreamFindFirstExample
{
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Arun", "Ajinkya","Guru","Sachin" );
        String name = s.filter(a->a.startsWith("G")).findFirst().get();
        System.out.println(name);

        Stream<String> s1 = Stream.of("Arun", "Ajinkya","Guru","Sachin" );
        String name1 = s1.filter(a->a.endsWith("n")).findAny().get();
        System.out.println(name1);
    }
}
