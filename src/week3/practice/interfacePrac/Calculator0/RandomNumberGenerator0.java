package week3.practice.interfacePrac.Calculator0;

public class RandomNumberGenerator0 implements NumberGenerator0 {
    @Override
    public int generate(int num) {
        return (int) (Math.random()*num);
    }
}
