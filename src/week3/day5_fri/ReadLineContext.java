package week3.day5_fri;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLineContext<T> {
    DoSomething<T> doSomething;

    public List<T> readByLine(String filename) throws IOException {
        List<T> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        //여기까지는 파일을 읽지 않음

        String str;
        while((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
        return result;
    }
}
