package study.weeok09.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {

    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> studentList = new ArrayList<>();

        studentList.add(new StudentDTO("학생A",30,99,20));
        studentList.add(new StudentDTO("학생B",80,100,88));
        studentList.add(new StudentDTO("학생C",32,67,66));

//        sample.printStudentNames(studentList);
        sample.filterWithScoreForLoop(studentList,80);

    }

    public void printStudentNames(List<StudentDTO> students) {
//        students.stream().forEach(student -> System.out.println(student.getName()));
        students.stream().map(student -> student.getName()).forEach(x -> System.out.println(x));
    }

    public void filterWithScoreForLoop(List<StudentDTO> studentList,int scoreCutLine){
        studentList.stream().filter(x -> x.getScoreMath() > scoreCutLine).forEach(student -> System.out.println(student.getName()));
    }
}
