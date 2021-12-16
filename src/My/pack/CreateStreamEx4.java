// Creating a stream from generated elements
//Creating a stream from iterate
//Finding Duplicate elements from stream
package My.pack;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamEx4
{
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.generate(()-> (new Random().nextInt(500)));
        stream.limit(10).forEach(p-> System.out.print("  "+p));
        System.out.println();
        //Stream.iterate(initial value, next value)
        Stream<Integer> stream1 = Stream.iterate(5,n -> n+5).limit(10);//.forEach(p-> System.out.print(p));
        stream1.forEach(p-> System.out.print("  "+p));

        System.out.println();
        List<Integer> numbers = Arrays.asList(new Integer[]{1,2,1,3,4,4});
        numbers.stream().filter(i -> Collections.frequency(numbers, i) >1)
                .collect(Collectors.toSet()).forEach(System.out::println);
    }
}
