package day2;

public class Encapsulation1 {
    //intialize the variable
    private int age=10;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String ageStatus() {
        String Status;
        if(age>18)
        {
            Status="major";
        }
        else {
            Status="minor";
        }
        return Status;
    }
public String getAgeStatus(){
        String getAgeStatus=ageStatus();
        return ageStatus();
}

}
