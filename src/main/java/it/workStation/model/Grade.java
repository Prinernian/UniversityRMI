package it.workStation.model;

import java.io.Serializable;
import java.util.List;

public class Grade implements Serializable {
    String studentId;
    String courseId;
    double grade;
    String date;

    public Grade(Student studentId, Course courseId, double grade, String date) {
        super();
        this.studentId = studentId.getId();
        this.courseId = courseId.id;
        this.grade = grade;
        this.date = date;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public double getGrade() {
        return grade;
    }
}
