package itis.oop.statistic;

import itis.oop.courses.CourseScore;
import itis.oop.students.Student;

public class PrintRatingStudents {
    public void printRatingOfStudents(Student[] students) {
        for (Student student : students) {
            double averageScore = 0;
            CourseScore[] currentCurses = student.getCourses();
            for (int i = 0; i < currentCurses.length; i++) {

            }
        }
    }
}
