package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Name1 Name1", 4, 9.2);
        Student st2 = new Student("Name2 Name2", 5, 8.2);
        Student st3 = new Student("Name3 Name3", 3, 6.8);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Start of method getStudents()");
//        System.out.println(students.get(3));
        System.out.println("Info about students:");
        System.out.println(students);
        return students;
    }
}
