package controller;

import model.*;
import service.DataService;
import service.StudyGroupService;
import view.StudentView;


import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void formStudyGroup(Teacher teacher ,List<Student>students){
        System.out.println(studyGroupService.formStudyGroup(teacher,students));
    }

    public void createStudent(String firstName, String lastName, String middleName){
        service.create(firstName,lastName,middleName,Type.STUDENT);
    }

    public void createTeacher(String firstName, String lastName, String middleName){
        service.create(firstName,lastName,middleName,Type.TEACHER);
    }

    public void getAllStudent(){
        List<User>users = service.getAllStudent();
        for (User user : users){
            Student student = (Student) user;
            studentView.printOnConsole(student);
        }
    }

}
