//ITITWE21309_Huynh_phuong_dai
public class courses {
    private String course_name;
    private int id;
    private int credits;
    public String getCourse_name() {
        return course_name;
    }
    public void setCourse_name(String course_name) {
        let course_name=String.toUpperCase();
        this.course_name = course_name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        if (credit >= 0)
            this.credits = credits;
    }
    
    
}
