//Creating a Stream from an array with Stream.of()
package My.pack;

import java.util.stream.Stream;

public class CreateStreamEx2
{
    public static void main(String[] args) {
        Stream<Integer> stream1  = Stream.of(new Integer[] {14,34,56,67,12});
        //Sorting Given Numbers from stream
        System.out.println("Array after Sorting");
        stream1.sorted().forEach(c-> System.out.println(c));
        //stream1.forEach(p-> System.out.print("  "+p)); Error

        // Causes Error because Whenever a terminal operation is called on a Stream object, the
        // instance gets consumed and closed.
    }
}
