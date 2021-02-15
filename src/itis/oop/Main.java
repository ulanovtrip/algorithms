package itis.oop;

public class Main {
    public static void main(String[] args) {
        TutorGenerator tutorGenerator = new TutorGenerator();
        CourseGenerator courseGenerator = new CourseGenerator();
        Tutor[] tutors = tutorGenerator.getTutors(20);
        Course[] courses = courseGenerator.getCourses(6);
        CoursePrinter coursePrinter = new CoursePrinter();
        TutorPrinter tutorPrinter = new TutorPrinter();
        tutorPrinter.printTutors(tutors, 3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        coursePrinter.printCourses(courses, 3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        CourseTutorAutoMatcher courseTutorAutoMatcher = new CourseTutorAutoMatcher();
        courseTutorAutoMatcher.autoMatch(courses, tutors);
        System.out.println("==========================================================================================");
        tutorPrinter.printTutors(tutors, 3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        coursePrinter.printCourses(courses, 3);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
