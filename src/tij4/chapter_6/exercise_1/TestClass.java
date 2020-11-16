package tij4.chapter_6.exercise_1;

import tij4.chapter_6.exercise_1.out_package.ClassInPackage;

public class TestClass {
    public static void main(String[] args) {
        ClassInPackage classInPackage = new ClassInPackage();
        System.out.println(classInPackage.getName());
    }
}
