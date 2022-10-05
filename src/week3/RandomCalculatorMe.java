package week3;

public class RandomCalculatorMe {

    private int a;
    int randomNumber = (int) (Math.random() * 9);

    public RandomCalculatorMe(int a) {
        this.a = a;
    }

    public void plus() {
        System.out.println(a + randomNumber);
    }

    public void minus() {
        System.out.println(a - randomNumber);
    }

    public void multiple() {
        System.out.println(a * randomNumber);
    }

    public void divide() {
        double result = 0.0;
        try {
            result = (double) a / randomNumber;
        } catch (ArithmeticException e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
        System.out.println(a / randomNumber);
    }
}

