package laby8.zad1;

import java.io.File;
import java.io.IOException;

public class Exercise {

    public static void main(String[] args) throws IOException {

        File file = new File("zad1\\exercise\\file3.txt");
        InformationProvider.displayInformation(file);

        File directory = new File("zad1\\exercise\\directory2");
        InformationProvider.displayInformation(directory);
    }
}
