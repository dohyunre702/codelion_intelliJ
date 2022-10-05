package week3;
//Calculator, CalculatorMain 분리 예제
public class CalculatorMainMe {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
//나는 static으로 만들어서 클래스명.함수명으로 빼온 것
        System.out.println(CalculatorMe.plus(a,b));
        System.out.println(CalculatorMe.minus(a,b));
        System.out.println(CalculatorMe.multiple(a,b));
        System.out.println(CalculatorMe.divide(a,b));
    }
}