package polymorphismexample;

public class PerformSum {

    public void sum(int a, int b){
        System.out.println("sum of two int numbers is : "+(a+b));
    }

    public void sum(int c, float d){
        System.out.println("sum of two int numbers is : "+(c+d));
    }

    public void sum(int a, int b, int c){
        System.out.println("sum of three int numbers is : "+(a+b+c));
    }

    public void sum(float a, float b){
        System.out.println("sum of two float numbers is : "+(a+b));
    }

    public void sum(double a, double b){
        System.out.println("sum of two double numbers is : "+(a+b));
    }

    public void sum(double a, int b){
        System.out.println("sum of one int and one double numbers is : "+(a+b));
    }

    public void sum(double a, float b){
        System.out.println("sum of one float and one double numbers is : "+(a+b));
    }
}
