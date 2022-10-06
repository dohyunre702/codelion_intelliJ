package week3.practice.interfacePrac;

class Parent1 {
    void display() {
        System.out.println("부모 클래스의 display()메소드입니다.");
    }
}

class Child1 extends Parent {
    @Override //메소드 오버라이딩
    void display() {System.out.println("자식 클래스의 display()메소드입니다.");}
    //오버로딩
    void display(String str){System.out.println(str);}
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child1 ch = new Child1();
        ch.display();
        ch.display("오버로딩된 display()메소드");
    }
}
