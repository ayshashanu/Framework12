package day8;

import java.util.Iterator;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Map<String, String> tmap = new java.util.TreeMap<>();
        tmap.put("name", "shanu");
        tmap.put("course", "BCA");
        tmap.put("collge", "MAC");
        tmap.put("place", "T.code");

        System.out.println("_________");
        Iterator<String> iterator = tmap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ":");

            System.out.println(tmap.get(key));

        }

    }  }