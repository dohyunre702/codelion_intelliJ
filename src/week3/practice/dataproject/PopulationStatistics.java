package week3.practice.dataproject;
import java.io.*;
import java.util.*;

public class PopulationStatistics {
    private String address; //초기화

    //4단계. parse() 로직 refactor
    public PopulationMove parse(String str) { //파일 한 줄을 매개변수로
        String[] splittedLine = str.split(","); //, 기준으로 분리 후 String[]으로 반환
        return new PopulationMove(splittedLine[0], splittedLine[1]); //fromsido, tosido의 인덱스 위치만 추출하고자 함
    }

    public PopulationStatistics(String address) { //address를 매개변수로 하는 생성자
        this.address = address;
    }

    //삽으로 푸듯 크게 한 줄씩 읽기
    //1-1단계. 시도1 : 한 줄 읽기 메소드. 공간 복잡도가 늘어남
    //FileReader fileReader = new FileReader(filename);
    //BufferedReader reader = new BufferedReader(fileReader);
/*    public void readByLine(String filename) throws IOException{
    BufferedReader reader = new BufferedReader(new FileReader(filename));  //객체 생성

    while((str = reader.readLine()) != null) { //파일 내용 한 줄씩 출력
        System.out.println(str);
    }
     reader.close();
    }*/

    //2단계. refactor : 반환형을 list<PopulationMove>로 변경
    public List<PopulationMove> readFileByLine(String filename) throws IOException {
        List<PopulationMove> pml = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String str = "";
        while ((str = reader.readLine()) != null) {
            PopulationMove populationMove = parse(str);
            pml.add(populationMove); //리스트에 저장
        }
        reader.close();
        return pml; //PopulationMove 리스트 반환
    }

    //3-1단계. 파일 생성 메소드 작성 > 루트 디렉토리 위치에 파일 생성
    public void createAFile(String filename) {
        File file = new File(filename);
        try { //try-catch
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //3-2단계. 리스트 객체의 내용을 새 파일에 입력
    public void write(List<String> strs, String filename) {
        File file = new File(filename);
        try { //try-catch
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace(); //예외 상황 분석 용도
            //.printStackTrace()는 예외 발생 당시의 호출스택에 있던 메소드의 정보와 예외 결과 출력
        }
    }

    //6단계. 히트맵에 맞게 매핑
    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + "," + populationMove.getFromSido()+"\n";
    }

    public Set<Integer> printSidoCd(List<PopulationMove> populationMoveList) {

        Set<Integer> intSet = new HashSet<>();
        for (PopulationMove pm : populationMoveList) {
            intSet.add(pm.getToSido());
            intSet.add(pm.getFromSido());
        }
        System.out.println(intSet);
        return intSet;
    }

    //5단계. List<Population>을 매개변수로 하는 getMoveCntMapㅁ메서드 로직
    //1. listpopulationmove를 순환하면서 "11:26" 형태의 key를 만든다.
    //2. moveCntMap에서 해당 key에 해당하는 Object가 없으면 생성하고 1이라고 체크
    //3. key로 꺼내서 +1
    //4. 리턴 moveCntMap
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for(PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if(moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            }
            moveCntMap.put(key, moveCntMap.get(key)+1);
        }
        return moveCntMap;
    }

    public Map<String, Integer> heatmapIdxMap() {
        Map<String, Integer> heatmap = new HashMap<>();
        //각 시,도 코드를 초기화
        heatmap.put("11",0);
        heatmap.put("26",1);
        heatmap.put("27",2);
        heatmap.put("28",3);
        heatmap.put("29",4);
        heatmap.put("30",5);
        heatmap.put("31",6);
        heatmap.put("36",7);
        heatmap.put("41",8);
        heatmap.put("42",9);
        heatmap.put("43",10);
        heatmap.put("44",11);
        heatmap.put("45",12);
        heatmap.put("46",13);
        heatmap.put("47",14);
        heatmap.put("48",15);
        heatmap.put("50",16);

        return heatmap;

    }
    /*
    public void readByLine2(String filename) {
        //1-2단계. 시도2 : 에러를 try-catch로 처리
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line, str;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            catch(IOException e){
                throw new RuntimeException(e);
            }
        }
     */

    //메인
    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\dohyu\\git\\codelion_intelliJ\\src\\week3\\day5_fri";//파일경로
        PopulationStatistics ps = new PopulationStatistics(address);
        //2단계. statistics.readByLine(address);를 리스트 객체에 맞게 Refactor
        List<PopulationMove> pml = ps.readFileByLine(address);

        //5단계. file 생성 refactor
        Map<String, Integer> map = ps.getMoveCntMap(pml);
        Map<String, Integer> heatMapIdxMap = ps.heatmapIdxMap();

        String targetFilename = "for_heatmap.txt";
        ps.createAFile(targetFilename);
        List<String> cntResult = new ArrayList<>();
        for (String key : map.keySet()) {
            String[] fromto = key.split(",");
            // 매핑을 해서 저장
            String s = String.format("[%s, %s, %d],\n", heatMapIdxMap.get(fromto[0]), heatMapIdxMap.get(fromto[1]), map.get(key));
            cntResult.add(s);
//            System.out.printf("key:%s value:%d\n", key, map.get(key));
        }
        ps.write(cntResult, targetFilename);
    }
}