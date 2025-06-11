package encapsulationexample;

public class MainEncapsulationClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        // using setters assign the values
        teacher1.setId(123);
        teacher1.setName("Deepika");
        teacher1.setGender("Female");
        teacher1.setSalary(35000.00);
        teacher1.setQualification("MSc");

        System.out.println("teacher1 is : "+teacher1);

        // use getters to read the data
        System.out.println("teacher1 name is : "+teacher1.getName());
        System.out.println("teacher1 qualification is : "+teacher1.getQualification());

    }
}
