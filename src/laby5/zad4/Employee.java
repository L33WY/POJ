package laby5.zad4;

public final class Employee {
    private final String name;
    private final String lastName;
    private int sallary;
    private String position;
    private final String emplId;

    public Employee(String name, String lastName, int sallary, String position, String emplId) {
        this.name = name;
        this.lastName = lastName;
        this.sallary = sallary;
        this.position = position;
        this.emplId = emplId;
    }

    @Override
    public String toString() {
        return "pracownik: " + this.name + " " + lastName + " pracujacy jako: "+ this.position + " zarabia: " + String.valueOf(this.sallary)+ " zl " + " jego ID to: " + this.emplId;
    }
}
