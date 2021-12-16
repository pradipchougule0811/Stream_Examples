//Creating Stream with Stream.of()

package My.pack;
import java.util.stream.Stream;
public class CreateStreamEx1
{
    public static void main(String[] args) {
        //Creating Stream of Strings
        Stream<String> stream1 = Stream.of("A","B","C","D");
        stream1.forEach(p-> System.out.println(p));

        //Creating Stream of Integers
        Stream<Integer> stream2 = Stream.of(1,12,23,45,56,78,89,90,34);
        stream2.forEach(e-> System.out.print("  "+e));

    }
}
