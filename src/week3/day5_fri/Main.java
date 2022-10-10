package week3.day5_fri;
/*
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadLineContext<PopulationMove> readLineContext = new ReadLineContext<>();
        List<PopulationMove> result = readLineContext.readByLine("");
    }
}


/*
        PopulationStatistics populationStatistics = new PopulationStatistics();


        // 1. 파일 읽어오기
        // 파일을 읽기 위한 준비
        String path = "C:\\TECHIT\\git\\data\\2021_인구관련연간자료.csv";

        // 파일 읽기 (한 글자씩 총 100만 글자)
        populationStatistics.readAChar(path);

        // 파일 읽기 (한 줄씩 읽기)
        populationStatistics.readByLine(path);

        // 자바 8 스타일로 한 줄씩 읽기
        populationStatistics.readByLine2(path);

        /*String data = ""
        PopulationMove pm = populationStatistics.parse(data);
        System.out.println(pm.getFromSido());
        System.out.println(pm.getToSido());*/



/*        public Map<String,Integer> getMoveCntMap(List<PopulationMove> pml) {

            Map<String, Integer> moveCntMap = new HashMap<>();
            for (PopulationMove pm : pml) {
                String key = pm.getFromSido() + "," + pm.getToSido();
                if (moveCntMap.get(key) == null) {
                    moveCntMap.put(key, 1);
                }
                moveCntMap.put(key, moveCntMap.get(key) + 1);
            }
            return moveCntMap;
        }
    }

    }
}
*/