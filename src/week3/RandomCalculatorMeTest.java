package week3;

public class RandomCalculatorMeTest {
    public static void main(String[] args) {
        int num = 20;

        RandomCalculatorMe testobj = new RandomCalculatorMe(num);
        testobj.plus();
        testobj.minus();
        testobj.multiple();
        testobj.divide();
    }
}