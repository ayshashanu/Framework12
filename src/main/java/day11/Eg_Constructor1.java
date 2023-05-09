package day11;

public class Eg_Constructor1 {
    private String name;
    private String place;
    private String district;
    private String state;
    private int number;


    public Eg_Constructor1(String name,String place,String district,String state,int number)
    {
        this.name=name;
        this.place=place;
        this.district=district;
        this.state=state;
        this.number=number;

    }
    public Eg_Constructor1()
    {

    }

    public String getPlace() {
        return place;
    }

    public int getNumber() {
        return number;
    }
}
