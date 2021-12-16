//creating a stream from the List.
package My.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamEx3
{
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++)
        {
            l1.add(i+1); // Adding elements to List
        }
        Stream<Integer> stream = l1.stream();
        stream.forEach(p-> System.out.print("  "+p));
    }
}
