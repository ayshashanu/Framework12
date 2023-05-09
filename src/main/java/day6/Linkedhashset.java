package day6;
import java.util.Iterator;
import java.util.Set;
public class Linkedhashset {
    public static void main(String[] args) {
        Set<String> arset=new java.util.LinkedHashSet<>();
        arset.add("helo");
        arset.add("all");
        arset.add("welcome");
        arset.add("to");
        arset.add("java learning");
        Iterator<String> iterator=arset.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }







    }
}
