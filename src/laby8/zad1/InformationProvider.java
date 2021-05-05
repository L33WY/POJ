package laby8.zad1;

import java.io.File;

public class InformationProvider {

    public static void displayInformation(File file){
        System.out.println("Nazwa pliku to: " + file.getName());
        System.out.println("Relatywna sciezka do pliku to: " + file.getPath());
        System.out.println("Czy jest katalogiem: " + file.isDirectory());
        System.out.println("Czy isnieje: " + file.exists());

    }
}
