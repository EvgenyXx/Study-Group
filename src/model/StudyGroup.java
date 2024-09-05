package model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup  {
    private final Teacher teacher;

    private final List<Student> students ;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("Ученая группа ").append("\n");
       stringBuilder.append("Учитель ").append(this.teacher);
       stringBuilder.append("\n");
       stringBuilder.append("Список студентов \n");
        for (int i = 0; i < students.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(students.get(i));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
