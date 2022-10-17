package week3.practice.dataproject;

//전입전출 값전달
public class PopulationMove {
    private int fromSido; //전입
    private int toSido; //전출

    //constructor 추가 fromSido, toSido를 받아 멤버변수에 넣음
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }
    //생성자 오버로딩
    //Integer.parseInt() 호출 > String값으로 받은 변수를 int로 초기화
    //
    public PopulationMove(String fromSido, String toSido){
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }

    //getter
    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }

    //setter
    public void setFromSido(int fromSido) {
        this.fromSido = fromSido;
    }

    public void setToSido(int toSido) {
        this.toSido = toSido;
    }
}
