package LA3_Q3;

public class Staff extends Person{
    private String school;
    private Double pay;

    public Staff(String name, String address, String school, Double pay){
        super(name,address);
        this.school=school;
        this.pay=pay;
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school=school;
    }
    public double getPay(){
        return pay;
    }
    public void setPay(double pay){
        this.pay=pay;
    }
    @Override
    public String toString(){
        return "name="+ name + "address=" + address + "school="+ school+ "pay"+pay;
    }

}
