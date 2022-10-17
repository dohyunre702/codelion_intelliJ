package week3.practice.dataproject;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PopulationStatistics {
    //1. 파일로부터 문자열 읽어오기. 리스트로 객체화
    public List<PopulationMove> readByLine(String filename) throws IOException {

        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filename)); //파일 읽어올 준비

        String str;
        while ((str = br.readLine()) != null) {
                PopulationMove pm = parse(str);
                pml.add(pm);//리스트에 넣어준다
            }
            br.close();
            return pml; //리스트 반환
        }

    //2. 읽어 온 문자열 파싱
    public PopulationMove parse(String data) {
        //생성자 오버로딩으로 바로 매개변수를 받는 게 가능해짐
        //split()메소드로 쪼개어진 문자열을 > int로 변환
        try { //parsing이 안되어서 (numberformatexception) 일시정지 상태
            String[] split = data.split(",");
            Integer fromSido = Integer.valueOf(split[0]);
            Integer toSido = Integer.valueOf(split[6]);
            return new PopulationMove(fromSido, toSido);
        } catch (NumberFormatException e) {
        };
    }

    //3. List로 객체화해서 이사 간 횟수 구하기
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) { //입력 타입 : list, 반환 타입: map
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key,1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
    }

    //메인
    public static void main(String[] args) throws IOException {
        PopulationStatistics ps = new PopulationStatistics();
        //data를 주소로 변경
        String address = "C:/Users/dohyu/git/codelion_intelliJ/src/week3/practice/dataproject/2021populationstat";
        PopulationMove populationMove = ps.parse(address);
        System.out.println(populationMove.getFromSido());
        System.out.println(populationMove.getToSido());
    }
}