package service;

import model.Student;
import model.StudyGroup;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {

    public StudyGroup formStudyGroup(Teacher teacher,List<Student>students){
        return new StudyGroup(teacher,students);
    }
}
