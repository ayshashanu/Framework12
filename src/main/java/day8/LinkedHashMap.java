package day8;

import java.util.Iterator;
import java.util.Map;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String,String> imap=new java.util.LinkedHashMap<>();
        imap.put("name","shanu");
        imap.put("course","BCA");
        imap.put("collge","MAC");
        imap.put("place","T.code");

        System.out.println("_________");
        Iterator<String> iterator=imap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ":");

            System.out.println(imap.get(key));


        }      }
}
