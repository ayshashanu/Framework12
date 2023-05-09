package day5;
import java.util.Iterator;
import java.util.List;


public class LinkedList {
    public static void main(String[] args) {
        List<String> arlist=new java.util.LinkedList<String>();
        arlist.add("hello");
        arlist.add("All");
        arlist.add("welcome");
        arlist.add("To");
        arlist.add ("Java learning") ;
        arlist.remove("All");
        arlist.add(1,"guys");
        arlist.add("hello");

        Iterator<String> iterator=arlist.iterator();
        while(iterator.hasNext());
        {
            System.out.println(iterator.next());
        }
    }
}
