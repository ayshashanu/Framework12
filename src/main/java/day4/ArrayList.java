package day4;
import java.util.List;
public class ArrayList {
    public static void main(String[] args) {
        List<String>arlist=new java.util.ArrayList<>();
        arlist.add("india");
        arlist.add("russia");
        arlist.add("china");
        arlist.add("us");


        //remove element
        arlist.remove("china");

        //adding element
        arlist.add("africa");

        //checking whether it is there or not(true or false)
        System.out.println(arlist.contains("india"));
        System.out.println(arlist.contains("japan"));
        for(int i=0;i<arlist.size();i++)
        {
            System.out.println(arlist.get(i));
        }




    }



}
