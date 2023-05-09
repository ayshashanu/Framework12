package day12;
//Exception Handling occurs during execution of the program.
//It breaks the execution and shows the error.
//There are 2 types
//   *CheckedException=Exception shows before the execution.
//   *UnCheckedException=Exception shows at the time of execution.
public class UnCheckedException {
    public static void main(String[] args) {
        //----it shows at the time of execution----

        //ArrayIndexOutOfBoundsException
        try
        {
            String a[]=new String[3];
            a[3]="shanu";
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());
        }
        System.out.println("HELLO");

        //nullpointer exception
        try {
            String b=null;
            System.out.println(b.length());
        }
        catch (NullPointerException e)
        {
            System.out.println(e.toString());
        }
        System.out.println("HII");
    }
}
