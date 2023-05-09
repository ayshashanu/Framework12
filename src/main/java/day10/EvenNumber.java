package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        //printing traditional method
        List<Integer> arlist = new ArrayList<>();
        arlist.add(1);
        arlist.add(2);
        arlist.add(3);
        arlist.add(4);
        arlist.add(5);
        Iterator<Integer> iterator = arlist.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        System.out.println("Stream Output");
    // printing even number using Streams
        List<Integer> arlists= Arrays.asList(11,12,13,14,15,16,17,18,19,20);
        List<Integer> collect=arlists.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(collect);


        //other way of printing
        arlists.stream().filter(x->x%2==0).forEach(x->System.out.println(x));
    }
}




