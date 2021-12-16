package My.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingInArray
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i< 10; i++){
            list.add(i);
        }
        Stream<Integer> stream = list.stream();
        Integer[] even = stream.filter(i -> i%2 == 0).toArray(Integer[]::new);
        //System.out.print(even);
        for(int i=0;i<even.length;i++) {
            System.out.print("  "+even[i]);
        }

    }
}
