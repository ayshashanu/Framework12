package day12;
// checkedException shows before the execution
//we will throw the Exception here...
public class CheckedException {
    public int div(int num1,int num2) throws Exception{
        int result;
        if(num2==0)
        {
            throw new Exception("zero is not allowed");
        }
        else {
            result=num1/num2;
        }
        return result;
    }

    public static void main(String[] args)  throws Exception{
        CheckedException checkedException=new CheckedException();
        System.out.println(checkedException.div(15,0));

    }
}
