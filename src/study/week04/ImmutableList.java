package study.week04;

import java.util.ArrayList;
import java.util.List;

public class ImmutableList {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("A-Sutdnet"));
        StudnetList studentList = new StudnetList(list);

        for (Student stu : studentList.getStudent()) {
            System.out.println(stu.toString());
        }
        System.out.println(list);

        list.add(new Student("B-Sutdnet"));
        list.add(new Student("C-Sutdnet"));

        for (Student stu : studentList.getStudent()) {
            System.out.println(stu.toString());
        }

        System.out.println(list);
    }
}

class StudnetList {

    private final List<Student> name;

    StudnetList(List<Student> name) {
        this.name = name;
    }

    List<Student> getStudent() {
        return this.name;
    }

}

class Student {

    private final String name;

    Student(String name) {
        this.name = name;
    }

    String getStudent() {
        return this.name;
    }

}



