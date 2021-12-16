//Find the Square of a Number from Stream
package My.pack;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindSquareNumbers
{
    public static void main(String[] args) {
        Stream<Integer> s = Stream.generate(()->(new Random()).nextInt(10));
        List<Integer> l = s.limit(5).map(e->e*e).collect(Collectors.toList());
        System.out.println(l);

        //Cube of Number
        Stream<Integer> s1 = Stream.of(5,7,3,8,9);
        List<Integer> l2 = s1.map(e->e*e*e).collect(Collectors.toList());
        System.out.println(l2);
    }
}
