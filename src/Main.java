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

        controller.formStudyGroup(1,teacher,students);

        List<Student>studentList = new ArrayList<>();
       Student student6 = new  Student("Смирнов", "Сергей", "Сергеевич", 1);
       Student student7 =  new Student("Кузнецов", "Кирилл", "Кириллович", 2);
       Student student8 =  new Student("Сидоров", "Александр", "Александрович", 3);
       Student student9 = new  Student("Васильев", "Василий", "Васильевич", 4);
       Student student10 =  new Student("Жданов", "Андрей", "Андреевич", 5);
       studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);

        Teacher teacher1 = new Teacher("Светалана","Бугаева","Петровна",2);

        controller.formStudyGroup(2,teacher1,studentList);




    }
}