package week3.practice.interfacePrac.Calculator0;

public class CalculatorTest {
    public static void main(String[] args) {
        NumberGenerator0 numberGenerator0 = new SpecificNumberGenerator0();
        Calculator calculator = new Calculator(numberGenerator0);
        calculator.plus();
        }
}
