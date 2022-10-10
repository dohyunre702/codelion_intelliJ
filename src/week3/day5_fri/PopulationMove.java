package week3.day5_fri;

/*
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PopulationMove {
    private int fromSido;//전입
    private int toSido;//전출

    //constructor 추가 fromSido, toSido를 받아 멤버변수에 넣는 기능

    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
        this.setSidoMap();
        this.fromSidoKorean = this.sidoMap.get(fromSido);
        this.toSidoKorean = this.sidoMap.get(toSido);
    }

    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
        this.setSidoMap();
        this.fromSidoKorean = this.sidoMap.get(fromSido);
        this.toSidoKorean = this.sidoMap.get(toSido);
    }

    public int getToSido() {
        return toSido;
    }
    public int getFromSido() {
        return fromSido;
    }

    public PopulationMove parse(String data) {
        return new PopulationMove(11,11);
        //csv
        populationMove pm = populationStatistics.parse(data);
        System.out.println(pm.getFromSido());
        System.out.printlnt(pm.getToSido());
//---------------------
        String[] splittedLine = data.split(",");
        return new PopulationMove(splittedLine[0], splittedLine[1]);
    }

    //3-1.populationMove
    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\dohyu\\git\\codelion_intelliJ\\src\\week3\\data\\2021_인구관련연간자료_20220927_66125";
        PopulationStatistics ps = new PopulationStatistics();
        List<PopulationMove> plm = ps.readByLine(address);

        List<String> strings = new ArrayList<>();
        for (PopulationMove pm: plm) {
        }
        //파일을 읽지 않는다. 리드할 때마다 한 바이트씩 읽게 됨

        String fileContents = "";
        while (fileContents.length() < 1,000,000) {
            //while문 도는 동안 한 바이트씩 읽어오기
            // 너무 오래걸리므로 bufferedreader를 사용해야 함
            char c = (char)fileReader.read();
            fileContents += c;
            System.out.println();
        }
        char c = (char)fileReader.read();
        System.out.println(c);
        char c2 = (char)fileReader.read();
        System.out.println(c2);
    }

}



*/
//직접 써보고 설계해보는 것이 중요하다.