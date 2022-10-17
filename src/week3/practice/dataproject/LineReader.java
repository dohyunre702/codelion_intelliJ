package week3.practice.dataproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

//파일 읽어오기 메서드 정리
public class LineReader {
    //filereader: 한 문자씩 읽어오기
    public void readByChar(String filename) throws IOException {
        FileReader fin = new FileReader(filename);

        int c = fin.read();

        String fileContents = "";
        while (fileContents.length() < 10000000) {
            char read = (char) fin.read();
            fileContents += read;
        }
        System.out.println(fileContents);
    }

    //BufferedReader 객체를 활용해 readLine()메소드로 한 줄씩 읽어온다.
   /* public String readByLine(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String str;
        while ((str = br.readLine()) != null) {
            str += br.readLine();
            return str;
        }
        br.close();
    }*/

    //라인 단위로 읽어오기 2
    //try-catch-resource 구문으로 사용한 자원(BufferedReader)을 자동 반납
    //Files.newBufferedReader() 활용해서 BufferedReader 객체 생성 가능
    public String readByLine2(String filename) {
        String line;
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filename), StandardCharsets.UTF_8)) {
            while ((line = br.readLine()) != null) {
                line += br.readLine();
                return line;
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }
}
