package sort.algorithms.comparions.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {
    private FileCreator() {
    }

    public static void createFile(String path, String content) throws IOException {
        File newFile = new File(path);
        newFile.getParentFile().mkdirs();
        boolean fileCreated = newFile.createNewFile();
        if(fileCreated) {
            try(FileWriter fileWriter = new FileWriter(path)) {
                fileWriter.write(content);
            }
        }
    }


}
