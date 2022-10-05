package week3;
//Calculator, CalculatorMain 분리 예제
public class CalculatorMe {

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiple(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        double result = 0;
        try {
            result = (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
        return result;
    }
}