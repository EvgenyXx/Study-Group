import controller.Controller;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        List<Student>students = new ArrayList<>();


        Student student1 = new Student("Ivanov", "Ivan", "Ivanovich", 1);
        Student student2 = new Student("Petrov", "Petr", "Petrovich", 2);
        Student student3 = new Student("Sidorov", "Sidor", "Sidorovich", 3);
        Student student4 = new Student("Vasiliev", "Vasiliy", "Vasilievich", 4);
        Student student5 = new Student("Zhdanov", "Zhdan", "Zhdanovich", 5);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Teacher teacher = new Teacher("Maria", "Perova", "Aleksandrovna", 1);


        controller.formStudyGroup(teacher,students);



    }
}