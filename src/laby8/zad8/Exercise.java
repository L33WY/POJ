package laby8.zad8;

import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {

        Student student = new Student("Dawid", "Lewandowski", "s22639");
        Student student1 = new Student("Tomek", "Kulej", "s12335");
        Student student2 = new Student("Ala", "Kotlowska", "s11111");
        Student student3 = new Student("George", "Blaszkiewicz", "s69054");
        Student student4 = new Student("Monika", "Jurczyk", "s19643");

        Student[] students = {student, student1, student2, student3, student4};

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
