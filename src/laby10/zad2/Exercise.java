package laby10.zad2;

public class Exercise {
    public static void main(String[] args) {

        Student student = new Student();
        student.addGrade("Polski", 2.5);
        student.addGrade("Angielski", 6.0);
        student.addGrade("POJ", 5.5);
        System.out.println(student.getAvargeGrade("Polski"));
    }
}
