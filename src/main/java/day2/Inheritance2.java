package day2;

public class Inheritance2 extends Inheritance {
    public static double square(int a)
    {
     double sqrt =Math.sqrt(a);
             return sqrt;
    }

    public static double power(int a,int b)
    {
        double pow=Math.pow(a,b);
        return pow;

    }

    public static void main(String[] args) {
        Inheritance2 inherit=new Inheritance2();
      int add=inherit.add(2,5);
        System.out.println(add);
      int sub= inherit.subtract(5,4);
        System.out.println(sub);
      int mul= inherit.multiply(7,9);
        System.out.println(mul);
      double sqrt=inherit.square(16);System.out.println(sqrt);

      double pow=inherit.power(3,5);System.out.println(pow);


    }




}
