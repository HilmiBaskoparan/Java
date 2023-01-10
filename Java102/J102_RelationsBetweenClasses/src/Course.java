public class Course {
    private String courseName;
    private String code;
    private Instructor teacher;
    
    public Course(String courseName, String code, Instructor teacher) {
        this.courseName = courseName;
        this.code = code;
        this.teacher = teacher;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public Instructor getTeacher() {
        return teacher;
    }

    public void setTeacher(Instructor teacher) {
        this.teacher = teacher;
    }
    
    public double calcAvg(Student[] students) {
        int sum = 0;
        for (Student student : students) {
            sum += student.getNote();
        }
        double avg = sum / students.length;
        return avg;
    }
    
}
