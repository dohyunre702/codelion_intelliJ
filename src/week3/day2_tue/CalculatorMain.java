package week3.day2_tue;
//Calculator, CalculatorMain 분리 예제. 생성자 사용
public class CalculatorMain {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
//생성자를 사용하면 a,b 값을 한 번만 할당하고도 손쉽게 원하는 값을 구할 수 있다.
        Calculator calculator = new Calculator(a,b);
        calculator.plus();
        calculator.minus();
        calculator.multiple();
        calculator.divide();
    }
}
