package day2;

public class Inheritance {
    public int c;

    public int add(int a, int b) {
        c = a + b;
        return c;
    }

    public int subtract(int a, int b) {
        c = a - b;
        return c;
    }

    public int multiply(int a, int b) {
        c = a * b;
        return c;
    }

    public static void main(String[] args) {
        Inheritance inheritance = new Inheritance();
        int add = inheritance.add(3, 7);
        System.out.println(add);
        int sub = inheritance.subtract(8, 5);
        System.out.println(sub);
        int mul = inheritance.multiply(3, 12);

        System.out.println(mul);
    }
}
