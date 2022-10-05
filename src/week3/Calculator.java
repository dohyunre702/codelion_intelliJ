package week3;
//Calculator, CalculatorMain 분리 예제
public class Calculator {
    private int a;
    private int b;
    //생성자 추가 단축키 alt + insert

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        System.out.println(a+b);
    }

    public void minus() {
        System.out.println(a-b);
    }

    public void multiple() {
        System.out.println(a*b);
    }

    public void divide() {
        double result = 0;
        try {
            result = (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }
        System.out.println(a/b);
    }
}
