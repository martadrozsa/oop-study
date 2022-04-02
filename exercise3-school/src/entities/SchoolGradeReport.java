package entities;

public class SchoolGradeReport {

    private Student student;
    private SchoolClass schoolClass;

    public SchoolGradeReport() {
    }

    public SchoolGradeReport(Student student, SchoolClass schoolClass) {
        this.student = student;
        this.schoolClass = schoolClass;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public SchoolClass getSchoolClass() {
        return schoolClass;
    }

    public void setSchoolClass(SchoolClass schoolClass) {
        this.schoolClass = schoolClass;
    }
}
