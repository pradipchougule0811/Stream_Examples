//Print Even Numbers Using Stream
package My.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindEvenNumbers
{
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(23,56,67,14,67,67);
        List<Integer> l = s.filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println(l);
    }
}
