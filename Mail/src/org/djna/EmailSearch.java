package org.djna;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailSearch {

    public static void main(String[] args) {
        String fileName = "Mail/sample.txt";
        if (args.length > 1){
            fileName = args[1];
        }
        try {
            searchFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void searchFile(String fileName) throws IOException {
        Path filePath = Paths.get(fileName);

        int counter = 0;
        String regex = "none";
        String contents = Files.readString(filePath);

        System.out.printf("Found %s %d times", regex, counter);

    }


}
