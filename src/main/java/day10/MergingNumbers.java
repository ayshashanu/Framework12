package day10;
import com.google.common.collect.Streams;
import java.util.Arrays;

public class MergingNumbers {
    public static void main(String[] args) {
        int a[]={5,4,3,2,1};
        int b[]={10,9,8,7,6};
        Streams.concat(Arrays.stream(a),Arrays.stream(b)).distinct().sorted().forEach(x->System.out.println(x));
    }
}
