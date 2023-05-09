package day8;
import java.util.Iterator;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,String> hmap=new java.util.HashMap<>();
        hmap.put("name","shanu");
        hmap.put("course","BCA");
        hmap.put("collge","MAC");
        hmap.put("place","T.code");
        System.out.println(hmap.get("name"));
        System.out.println(hmap.get("course"));


        System.out.println("_________");
        Iterator<String> iterator=hmap.keySet().iterator();
        while (iterator.hasNext())
        {
            String key= iterator.next();
            System.out.println(key+":");

            System.out.println(hmap.get(key));

        }

    }
}
