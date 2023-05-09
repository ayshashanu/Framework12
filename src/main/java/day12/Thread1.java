package day12;

public class Thread1 {
    public int div(int num1,int num2) throws Exception {
        int result;
        if (num2 == 0)
        {
            throw new Exception("zero is not allowed");
        }
        else {
            result = num1 / num2;
        }
        try {
            java.lang.Thread.sleep(-1);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Thread1 thread1=new Thread1();
        System.out.println(thread1.div(15,5));


    }

}
