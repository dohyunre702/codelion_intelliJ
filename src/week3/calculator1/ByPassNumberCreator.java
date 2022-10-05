package week3.calculator1;
//인터페이스 구현체
public class ByPassNumberCreator implements NumberCreator{
    @Override
    public int create(int num) {
        return num;
    }
}
