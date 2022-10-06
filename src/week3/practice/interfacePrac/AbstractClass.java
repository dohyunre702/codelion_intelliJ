package week3.practice.interfacePrac;

abstract class Animal {abstract void cry();}
class Cat extends Animal {
    @Override
    void cry() {System.out.println("냐옹나용!");}
}
class Dog extends Animal {
    //cry 메서드 없을 때 에러 발생 : class 'Dog' must either be declared abstract or implement abstract method 'cry()' in 'Animal'
    @Override
    void cry() {System.out.println("멍멍!");}
}

public class AbstractClass {
    public static void main(String[] args) {
        //Animal a = new Animal(); 추상클래스는 인스턴스 생성 불가
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();
    }
}
