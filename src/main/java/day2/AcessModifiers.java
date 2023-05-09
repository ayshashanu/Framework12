package day2;
//private can be access only inside a class;
//public can be  access anywhere in class,in same package and in another package;
// protected can be access in class,in same package and another package with the help of inheritance;
// default can be access only in class ,and the class in same package;
public class AcessModifiers {
    //initialising the variable in instance
    private String pri="private";
    public  String pub="public";
    protected String pro="protected";
    String def="default";

    //creating methods
    private String pri()
    {
        System.out.println("this method is private");
        return pri;
    }
    public  String pub()
    {
        System.out.println("this method is public");
        return pub;
    }

    protected String pro()
    {
        System.out.println("this method is protected");
        return pro;
    }

    String def()
    {
        System.out.println("this method is default");
        return def;
    }
    //creating main method and calling main method
    public static void main(String[] args) {
        AcessModifiers acessModifiers=new AcessModifiers();
       System.out.println(acessModifiers.pri);
        System.out.println(acessModifiers.pub);
        System.out.println(acessModifiers.pro);
        System.out.println(acessModifiers.def);
        acessModifiers.pri();
        acessModifiers.pub();
        acessModifiers.pro();
        acessModifiers.def();
    }

}

