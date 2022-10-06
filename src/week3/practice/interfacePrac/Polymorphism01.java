package week3.practice.interfacePrac;
// 생성자 this & super, 메소드 오버라이딩, 다형성
class Parent{
    int num1 = 100;
    private int a, b;
    public int x = 10;

    // 기본 생성자 parent();가 숨겨져 있음
    Parent() {};
    // 매개변수가 있는 생성자
    Parent(int i) {
        System.out.printf("출력해봅니다" + i);
    }

    // 기본 메서드 (기능 추가)
    void print(){
        System.out.println("기본 출력");
    }

    void display() {
        System.out.println(num1);
    };
}
class Child extends Parent{ //child는 parent의 자식 클래스
    int c = 2;
    @Override
    void display() { //메서드 오버라이딩
        int num1 = 200;
        int num2 = 300;
        System.out.println(num1);
        System.out.println("super.num1 + num2:" + (super.num1 + num2)); //상속받은 public 변수 참조. 400
        System.out.println("num1 + num2:" + (num1 + num2));//상속받지 않음. 500
    }
}


class Brother extends Parent{ //brother는 parent의 자식 클래스
    int d = 3;

    void display() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}

public class Polymorphism01 {
    public static void main(String[] args) {

        Child c1 = new Child();
        c1.display();

        Brother b = new Brother();
        b.display();

        Parent p2 = new Child(); //부모 타입의 참조변수가 자식의 인스턴스 참조
        // error. Child c2 = new Parent(); //자식 타입의 참조변수는 부모 타입의 인스턴스 참조할 수 없음

        // 다형성
        Parent p = new Parent(); //부모 스스로를 참조하는 객체 생성 (기본 생성자 활용)
        System.out.println(p instanceof Object); //t
        System.out.println(p instanceof Parent); //t
        System.out.println(p instanceof Child); //f
        //ㄴ 부모 클래스의 참조변수 p는 자식 클래스를 참조하고 있지 않으므로 false

        Child c = new Child();
        System.out.println(c instanceof Object); //t
        System.out.println(c instanceof Parent); //t
        // ㄴ 자식 클래스의 참조변수 c는 부모 클래스를 상속받았으므로 true
        System.out.println(c instanceof Child); //t




    }
}
