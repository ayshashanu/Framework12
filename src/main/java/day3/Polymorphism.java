package day3;

public class Polymorphism {

public int add(int a,int b)
{
    return a+b;
}
public int add(int a,int b,int c)
{
    return a+b+c;
}
public double add(double a,double b)
{
    return a+b;
}
public String addString()
{
    String a="shanu",b="shameen";
    return a+b;
}

    public static void main(String[] args) {
        Polymorphism poly=new Polymorphism();
        System.out.println(poly.add(5,7));
        System.out.println(poly.add(5,8,9));
        System.out.println(poly.add(10.2,7.2));
        System.out.println(poly.addString());

    }
}
