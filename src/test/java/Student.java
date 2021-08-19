import java.util.ArrayList;

public class Student {

    private String name;
    private long studentId;
    private ArrayList<Integer> grades;


    public Student(String name, long studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public long getId(){
        return studentId;
    }

    public String getStudentName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public double getGradeAverage(){
        double sumOfPoints = 0;
        double numberOfGrades = grades.size();
        for (Integer grade : grades){
            sumOfPoints += grade;
        }
        return sumOfPoints/numberOfGrades;
    }
}
