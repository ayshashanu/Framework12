package day9;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AdressMain  extends Adressbook{
    public static void main(String[] args) {
        AdressMain m1=new AdressMain();
        m1.setName("Aysha");
        m1.setPlace("t.code");
        m1.setDistrict("kk");
        m1.setState("tamil nadu");
        m1.setNumber(1345455688);

        AdressMain m2=new AdressMain();
        m2.setName("shameen");
        m2.setPlace("manavai");
        m2.setDistrict("kk");
        m2.setState("tamil nadu");
        m2.setNumber(12345689);

        AdressMain m3=new AdressMain();
        m3.setName("shanu");
        m3.setPlace("thuckaly");
        m3.setDistrict("kk");
        m3.setState("tamil nadu");
        m3.setNumber(987654321);

//listing the details using map
        Map<String,Adressbook> ad=new TreeMap<>();
        ad.put("Aysha",m1);
        ad.put("shameen",m2);
        ad.put("shanu",m3);


//get the input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name whom you are looking for:");
        String userinput=sc.next();


//display the input given by the user
       System.out.println(ad.get(userinput).getPlace());
       System.out.println(ad.get(userinput).getDistrict());
       System.out.println(ad.get(userinput).getState());
       System.out.println(ad.get(userinput).getNumber());

    }
}
