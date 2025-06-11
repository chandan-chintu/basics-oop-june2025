package polymorphismexample;

public class MainPloymorphismClass {

    public static void main(String[] args) {
        PerformSum performSum = new PerformSum();

        performSum.sum(23,21);
        performSum.sum(3,2,4);
        performSum.sum(34.89,23.12);
        performSum.sum(3.45f,4.23f);
        performSum.sum(3.22,2);
        performSum.sum(3.44,5.67f);
    }
}
