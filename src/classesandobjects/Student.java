package classesandobjects;

public class Student {

    public int id;
    public String name;
    public String dob;
    public String address;
    public String email;
    public String grade;

    // it converts object into string
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
