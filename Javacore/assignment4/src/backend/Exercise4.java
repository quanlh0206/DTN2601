package backend;

import entity.Student;

public class Exercise4 {
    public void question1() {
        Student student = new Student("Quân", "Thanh Hóa");
        student.setScore(4);
//        student.setScore(11);
        student.addScore(2);
//        student.addScore(10);
        student.infoStudent();
    }
}
