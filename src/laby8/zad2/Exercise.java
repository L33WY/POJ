package laby8.zad2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise {

    public static void main(String[] args) throws IOException {

        File file = new File("zad2\\file.txt");

        Stream<String> linesFormFile = Files.lines(file.toPath());
        List<String> listOfLines = linesFormFile.collect(Collectors.toList());

        for (int i=0; i < listOfLines.size(); i++){
            String line = listOfLines.get(i);

            String pattern = "\\d+";
            String pattern2 = "[0-9]+";
            String pattern3 = "(\\d+[+,\\-,/, *]{1}\\d+)+";
            boolean isNumber = line.matches(pattern3);
            System.out.println(line + " " + isNumber);
        }

    }
}
