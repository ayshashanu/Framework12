package day12;
//use of Thread.sleep() is it will make some delay
public class Thread {
    public int div(int num1,int num2) throws Exception{
    int result;
    if(num2==0)
    {
        throw new Exception("zero is not allowed");
    }
    else {
        result=num1/num2;
    }
    java.lang.Thread.sleep(5000);
    return result;
}

    public static void main(String[] args) throws Exception {
        Thread thread=new Thread();
        System.out.println(thread.div(15,5));

    }

}
