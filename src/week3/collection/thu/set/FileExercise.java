package week3.collection.thu.set;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExercise {
    public static void main(String[] args) throws FileNotFoundException {
        //./
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file:files) {
            System.out.println(file);
        }
    }
}

/*.\.git
.\.gitignore
.\.idea
.\codelion_intelliJ.iml
.\out
.\src

Process finished with exit code 0
*/