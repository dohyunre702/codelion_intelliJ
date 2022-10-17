package week3.practice.dataproject;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PopulationStatistics {

    public PopulationMove parse(String data) {
        int fromSido = 0, toSido = 0;
        //생성자 오버로딩으로 바로 매개변수를 받는 게 가능해짐
        //split()메소드로 쪼개어진 문자열을 > int로 변환
        String[] split = data.split(",");
        return new PopulationMove(split[0], split[6]);
    }

    public void readByLine(String filename) {//에러를 try-catch로 처리
        String line;
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //메인
    public static void main(String[] args) throws IOException {
        PopulationStatistics ps = new PopulationStatistics();
        String data = "41,650,25000,2021,05,21,11,290,68500,3,8,059,2,,,,,,,,,,,,,,,,,,,,,,,,,,,,347226";
        PopulationMove populationMove = ps.parse(data);
        System.out.println(populationMove.getFromSido());
        System.out.println(populationMove.getToSido());
    }
}