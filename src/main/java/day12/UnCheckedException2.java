package day12;
//combination:
//* try is possible with one or more multiple catches.
//* try is possible without any catch if final is possible;
//*try is without possible without catch or final
public class UnCheckedException2 {
    public static void main(String[] args) {
        //Exception is common for all errors
        try {
            String a[]=new String[3];
            a[3]="shanu";
            String b=null;
            System.out.println(b.length());
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        finally {
            System.out.println("Execute anyways");
        }
        System.out.println("hello");
    }
}
