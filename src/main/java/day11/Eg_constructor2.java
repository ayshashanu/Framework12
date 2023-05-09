package day11;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Eg_constructor2  extends Eg_Constructor1{
    public static void main(String[] args) {
       Eg_Constructor1 eg1=new Eg_Constructor1("ram","tcode","kanyakumari","tamil nadu",987522190);
       Eg_Constructor1 eg2=new Eg_Constructor1("jaanu","colachel","kanyakumari","tamil nadu",432902345);


       //listing the details using map
        Map<String,Eg_Constructor1> ad=new TreeMap<>();
        ad.put("ram",eg1);
        ad.put("jaanu",eg2);

        //get the input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name whom you are looking for");
        String userinput=sc.next();

        //display the input by the user
        System.out.println(ad.get(userinput).getPlace());
        System.out.println(ad.get(userinput).getNumber());
    }
}
