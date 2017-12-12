package nl.shadeblackwolf.denversgame.testHelpers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static nl.shadeblackwolf.denversgame.testHelpers.PredicateHelp.not;

public class TestFileManager {
    private List<File> tempFiles = new ArrayList<>();
    public void purgeTemporaryFiles() {
        tempFiles.stream().filter(not(File::delete)).findFirst().ifPresent(
                undeleted -> {
                    throw new RuntimeException("Could not delete file: " + undeleted.getName());
                }
        );
    }

    public void createFile(String fileName) {
        try {
            File tempFile = new File(fileName);
            if (!tempFile.createNewFile()) {
                throw new RuntimeException("Could not create file: settings.json");
            } else {
                tempFiles.add(tempFile);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
