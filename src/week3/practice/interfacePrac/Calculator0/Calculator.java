package week3.practice.interfacePrac.Calculator0;

class Calculator {
    NumberGenerator0 numberGenerator0;
    public Calculator(NumberGenerator0 numberGenerator0) {
        this.numberGenerator0=numberGenerator0;
    }
    public void plus(){
        System.out.println(10+numberGenerator0.generate(10));
    }
}