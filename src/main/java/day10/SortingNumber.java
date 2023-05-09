package day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingNumber {
    public static void main(String[] args) {
        //sorting numbers
        List<Integer> arlist = Arrays.asList(34, 23, 12, 37);
        arlist.stream().sorted().forEach(x -> System.out.println(x));


        //sorting string
        List<String> arlists = Arrays.asList("Aysha", "Shanu", "Mohamed");
        List<String> name = arlists.stream().sorted().collect(Collectors.toList());
        System.out.println(name);


        //sorting using Array
        String a[] = {"mallu", "suntv", "ktv"};
        Arrays.stream(a).sorted().forEach(x -> System.out.println(x));

    }
}
