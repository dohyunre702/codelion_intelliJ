package week3.day5_fri;
/*
import week3.practice.dataproject.PopulationMove;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

//인터페이스가 편하다고 무분별하게 쓰는 것은 좋지 않다

public class PopulationStatistics {

    public void readAChar(String filename) throws IOException{
        FileReader fileReader = new FileReader(filename);
        // 파일을 읽지 않는다.

        String fileContents = "";
        while(fileContents.length() < 1_000_000) {
            char c = (char) fileReader.read();
            fileContents += c;
            System.out.println(fileContents);
        }
        System.out.println(fileContents);
    }//1byte읽기. 1줄씩 읽는 기능

    public void readByLine(String filename) throws IOException {
        //삽으로 푸듯 크게 한 줄씩 읽기
        //시도1:공간 복잡도가 늘어남
        //FileReader fileReader = new FileReader(filename);
        //BufferedReader reader = new BufferedReader(fileReader);

        //refactoring
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String str;
        while(str = reader.readLine() != null) {
            System.out.println(str);
        }
        reader.close();
    }

    public void readByLine2(String filename) {
        //에러를 trycatch로 처리
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            } catch(IOException e){
                throw new RuntimeException(e);
            }
        }

        public static void main (String[]args) throws IOException {
            String address = "";
            PopulationStatistics populationStatistics = new PopulationStatistics();
            List<PopulationMove> pml = populationStatistics.readByLine(address);

            //System.out.println(pml.size());
            //List<String> strings = new ArrayList<>();
            for (PopulationMove pm : pml) {
                System.out.print("전입:%s, 전출:%s\n", pm.getFromSido(), pm.getToSido());
            }
        }

    }
}

 */