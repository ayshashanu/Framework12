package day7;

public class Condition {
    public static void main(String[] args) {
        //if else condition
        boolean flag = true;
        if (flag) {
            System.out.println("flag is true");
        } else {
            System.out.println("flag is false");
        }
        System.out.println("-----------------");
        String a = "Aysha";
        if (a.equals("Aysha")) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
        }
        System.out.println("-------------");
        String b = "Aysha";
        if (b.toLowerCase().equals("aysha")) {
            System.out.println("valid name");
        } else {
            System.out.println("invalid name");
        }
        System.out.println("____________");
        String c = "shameen";
        if (c.contains("shameen")) {
            System.out.println("shameen is there");
        } else {
            System.out.println("shameen is not there");
        }
        System.out.println("_________");

        String d = "Location:paris";
        if (d.contains("Location")) {
            String place = d.replace("paris", "goa");
            System.out.println(place);
        } else {
            System.out.println("invalid place");
        }
        System.out.println("_________");
        String e="city:chennai";
        if(e.contains("city")) {
            String[] str = e.split(":");
            System.out.println("city:" + str[1]);
        }
        else {
            System.out.println("invalid");
        }





    }
}



