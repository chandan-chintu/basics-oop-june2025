package interfaceexample;

public class SampleClass implements SampleInterface, SampleInterface2{
    @Override
    public void sample1() {
        System.out.println("sample1 inside SampleClass");
        System.out.println("abc value is : "+SampleInterface.abc);
    }

    @Override
    public void sample2() {
        System.out.println("sample2 inside SampleClass");
        System.out.println("mno value is : "+SampleInterface.mno);
    }
    @Override
    public void sample3() {
        System.out.println("sample3 inside SampleClass");
    }
}
