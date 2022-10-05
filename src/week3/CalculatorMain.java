package week3;
//Calculator, CalculatorMain 분리 예제
public class CalculatorMain {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println(Calculator.plus(a,b));
        System.out.println(Calculator.minus(a,b));
        System.out.println(Calculator.multiple(a,b));
        System.out.println(Calculator.divide(a,b));
    }
}
