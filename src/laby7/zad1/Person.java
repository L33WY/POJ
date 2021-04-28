package laby7.zad1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private Date birthYear;

    private boolean validatePersonalData(String firstName, String lastName, String birthYear){
        if (firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("Imie oraz nazwisko nie moga byc puste!");
            return false;
        }
        DateFormat format = new SimpleDateFormat("d-M-yyyy");
        try {
            this.birthYear = format.parse(birthYear);
        }catch (Exception e){
            System.out.println("Podaj poprawna date w formacie dd-mm-yyyy!");
            return false;
        }
        return true;
    }

    public Person() {
        boolean creatingPerson = true;
        do{
           creatingPerson = true;
           Scanner scan = new Scanner(System.in);

            System.out.println("Podaj imie: ");
            String firstName = scan.nextLine();
            System.out.println("Podaj nazwisko: ");
            String lastName = scan.nextLine();
            System.out.println("Podaj date urodzenia w formacie dd-mm-yy: ");
            String birthYear = scan.nextLine();

            creatingPerson = validatePersonalData(firstName, lastName, birthYear);

            if (creatingPerson){
                DateFormat format = new SimpleDateFormat("d-M-yyyy");
                this.firstName = firstName;
                this.lastName = lastName;
            }
        }while (!creatingPerson);


    }

    @Override
    public String toString() {
        return String.format("imie: %s nazwisko: %s rok urodzenia: " + this.birthYear, this.firstName, this.lastName);
    }
}
