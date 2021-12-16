//Creating a stream from the characters of a given string
package My.pack;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStreamEx5
{
    public static void main(String[] args) {
        //IntStream of(int t) returns a sequential IntStream containing a single element.
        IntStream stream = "pradipchougule0811".chars();
        stream.forEach(p -> System.out.print(" "+(char)p));

        System.out.println();
        //Replacing $ into #
        Stream<String> stream1 = Stream.of("P$A$C".replace('$','#'));
        stream1.forEach(p -> System.out.print(p));
    }
}
