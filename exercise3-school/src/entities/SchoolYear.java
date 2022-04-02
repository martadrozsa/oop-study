package entities;

import java.util.ArrayList;
import java.util.List;

public class SchoolYear {

    private List<SchoolClass> schoolClassList;

    public SchoolYear(List<SchoolClass> schoolClassList) {
        schoolClassList = new ArrayList<>();
    }

    public SchoolClass getSchoolClassByYear(int year){
        return null;
    }
}
