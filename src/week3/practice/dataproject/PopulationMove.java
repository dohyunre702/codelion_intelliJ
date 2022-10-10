package week3.practice.dataproject;


public class PopulationMove {
    private int fromSido; //전입
    private int toSido; //전출

    //constructor 추가 fromSido, toSido를 받아 멤버변수에 넣는 기능
    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }
    //오버로딩
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
