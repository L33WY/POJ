package laby10.zad2;

import java.util.*;

public class Student {

    private List<Double> gradesList = new ArrayList<>();
    private Map<String, List> subjectList = new HashMap<>();

    public void addGrade(String subject, Double grade){
        if (subjectList.containsKey(subject)){
            this.subjectList.put(subject, Collections.singletonList(this.subjectList.get(subject).add(grade)));
        }else {
            subjectList.put(subject, new ArrayList());
        }
    }
    public double getAvargeGrade(String subject){
        List<Double>subjectGrades = (ArrayList) subjectList.get(subject);
//        subjectList.get(subject);
        Double gradeSum = 0.0;
        if (subjectGrades.size() == 0.0){
            return gradeSum;
        }else {
            for (Double grade : subjectGrades){
                gradeSum += grade.doubleValue();
            }
            return gradeSum;
        }
    }
}
