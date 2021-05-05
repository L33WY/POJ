package laby8.zad3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise{

    public static void main(String[] args) throws IOException {
        File file = new File("src\\laby8\\zad3\\file.txt");
//        file.createNewFile();

        Stream<String> linesFormFile = Files.lines(file.toPath());
        List<String> listOfLines = linesFormFile.collect(Collectors.toList());

        int sum = 0;
        for (int i=0; i < listOfLines.size(); i++) {
            String line = listOfLines.get(i);
            if (i!= 0){
                if ( i % 2 == 0){
                    sum += Integer.parseInt(line);
                }
            }else {
                sum += Integer.parseInt(line);
            }
        }
        System.out.println("Suma co 2 linijki to: " + sum);
    }
}
