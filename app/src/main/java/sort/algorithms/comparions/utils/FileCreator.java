package sort.algorithms.comparions.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    public static void createFile(String path, String content) throws IOException {
        File newFile = new File(path);
        boolean fileCreated = newFile.createNewFile();
        if(fileCreated) {
            try(FileWriter fileWriter = new FileWriter(path)) {
                fileWriter.write(content);
            }
        }
    }


}
