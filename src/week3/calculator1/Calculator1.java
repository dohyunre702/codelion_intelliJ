package week3.calculator1;

public class Calculator1 {

    NumberCreator numberCreator;
    private int baseNum;

    public Calculator1(NumberCreator numberCreator) {
        this.numberCreator = numberCreator;
        this.baseNum = baseNum;
    }

    public void plus(int num){
        System.out.println(num + numberCreator.create(10));
    }
}
