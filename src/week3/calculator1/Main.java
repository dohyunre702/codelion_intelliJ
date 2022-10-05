package week3.calculator1;

public class Main {
    public static void main(String[] args){

        Calculator1 calculator = new Calculator1(new ByPassNumberCreator());
        calculator.plus(10);
    }
}
