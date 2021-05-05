package laby8.zad8;

public class Student implements Comparable <Student> {

    private String first_name;
    private String last_name;
    private String index;

    public Student(String first_name, String last_name, String index) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.index = index;
    }

    @Override
    public String toString() {
        return String.format("imie: %s | nazwisko: %s | indeks: %s ", this.first_name, this.last_name, this.index);
    }

    public String getIndex() {
        return index;
    }

    @Override
    public int compareTo(Student student) {
        return this.index.compareTo(student.getIndex());
    }
}
