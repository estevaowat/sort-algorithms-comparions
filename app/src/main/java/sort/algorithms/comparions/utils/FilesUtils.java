package sort.algorithms.comparions.utils;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class FilesUtils {

    public static Set<File> listFilesFromDirectory(String pathDirectory) {
        File file = new File(pathDirectory);
        if(file.isDirectory()) {
            return Arrays.stream(Objects.requireNonNull(file.listFiles()))
                    .filter(File::isFile)
                    .collect(Collectors.toSet());
        }
        return new HashSet<>();
    }

    public static boolean deleteDirectory(File directoryToBeDeleted) {
        File[] allContents = directoryToBeDeleted.listFiles();
        if(allContents != null) {
            for(File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }


}
