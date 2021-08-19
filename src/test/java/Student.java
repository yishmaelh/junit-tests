public class Student {

    private String name;
    private long studentId;

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

}
