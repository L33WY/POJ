package laby8.zad4;

import java.io.*;
import java.time.LocalDate;

public class Exercise {

    public static void main(String[] args) {
        File file = new File("src\\laby8\\zad4\\file.txt");

        LocalDate dateToday = LocalDate.now();

        int yearsMatches = 0;
        while (yearsMatches < 100){
            LocalDate date = dateToday.plusYears(1);
            dateToday = date;
            if (date.isLeapYear()){
                yearsMatches += 1;
                try{
                    //Nie wiem czemu ale nic się w tym pliku nie zapisuje
                    FileWriter fileWriter = new FileWriter(file.getName());
                    fileWriter.write(date + "\n");
                    fileWriter.close();
                } catch (IOException e){
                    System.out.println(e);
                }

            }
        }
    }
}
