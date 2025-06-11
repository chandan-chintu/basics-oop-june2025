package classesandobjects;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("Hello everyone, welcome to Spring classes!");

        //creating the objects
        Student student1 = new Student();
        System.out.println("student1 before assigning the values : "+student1);

        // assign the values
        student1.id =101;
        student1.name="Ajay";
        student1.address="456, dhdjid, djdjdioe, kssoow";
        student1.grade="6th grade";
        student1.email="ajay123@gmail.com";
        student1.dob="12/12/2012";
        System.out.println("student1 after assigning the values : "+student1);

        Demo d1 = new Demo();
        d1.demo1();
        System.out.println("abc value is : "+d1.abc);

        Demo.demo2();
        System.out.println("pqr value is : "+Demo.pqr);

        int aaa =900;
        final int bbb=400;

        System.out.println("aaa is : "+aaa);
        System.out.println("bbb is : "+bbb);

        // update variables
        aaa=300;
        //bbb=200; - cannot update final variable
        System.out.println("aaa after change is : "+aaa);
        System.out.println("bbb is : "+bbb);

    }
}
