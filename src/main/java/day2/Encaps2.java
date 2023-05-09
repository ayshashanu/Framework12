package day2;

public class Encaps2 {
    public static void main(String[] args) {
        Encapsulation1 encap=new Encapsulation1();
       int age =encap.getAge();
       System.out.println(age);
        System.out.println(encap.getAgeStatus());
        encap.setAge(20);
        System.out.println(encap.getAge());
        System.out.println(encap.getAgeStatus());
    }
}
