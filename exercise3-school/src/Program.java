import entities.*;

public class Program {

    public static void main(String[] args) {

        Coordination coordination = new Coordination();

        SchoolYear schoolYear = coordination.getSchoolYearById(1);

        SchoolClass schoolClass = schoolYear.getSchoolClassByYear(2020);

        Student student = schoolClass.getStudentByName("Ana");

        SchoolGradeReport schoolGradeReport = coordination.createSchoolGradeReport(student, schoolClass);

        System.out.println(schoolGradeReport);
    }
}
