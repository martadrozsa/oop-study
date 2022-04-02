package entities;

import java.util.ArrayList;
import java.util.List;

public class Coordination {

    private List<SchoolYear> schoolGradeList;

    public Coordination() {
    }

    public Coordination(List<SchoolYear> schoolGradeList) {
        schoolGradeList = new ArrayList<>();
    }

    public SchoolYear getSchoolYearById(int id) {
        return null;
    }

    public SchoolGradeReport createSchoolGradeReport(Student student, SchoolClass schoolClass) {
        return new SchoolGradeReport(student, schoolClass);
    }

}
