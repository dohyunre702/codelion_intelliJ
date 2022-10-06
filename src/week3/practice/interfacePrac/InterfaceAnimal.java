package week3.practice.interfacePrac;

import java.awt.datatransfer.SystemFlavorMap;

interface MyAnimal {public abstract void cry();}
interface Pet {public abstract void play();}

class Coshort implements MyAnimal, Pet{
    @Override
    public void cry() {
        System.out.println("냐옹냐옹");
    }
    @Override
    public void play() {
        System.out.println("쥐 잡기 놀이!");
    }
}

class Doberman implements MyAnimal, Pet{
    @Override
    public void cry() {
        System.out.println("멍멍머멍");
    }

    @Override
    public void play() {
        System.out.println("원반 던지기 놀이~");
    }
}
public class InterfaceAnimal {
    public static void main(String[] args) {
        Coshort honey = new Coshort();
        Doberman hans = new Doberman();

        honey.cry();
        honey.play();
        hans.cry();
        hans.play();
    }
}
