package it.workStation.model;

import java.io.Serializable;
import java.util.List;

public class Grade implements Serializable {
    Student studentId;
    Course courseId;
    double grade;
    String date;

    public Grade(Student studentId, Course courseId, double grade, String date) {
        super();
        this.studentId = studentId;
        this.courseId = courseId;
        this.grade = grade;
        this.date = date;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
    public double getGrade() {
        return grade;
    }
    public void setStudentId(Student studentId){
        this.studentId = studentId;
    }
    public Student getStudentId(){
        return studentId;
    }
    public void setCourseId(Course courseId){
        this.courseId = courseId;
    }
    public Course getCourseId(){
        return courseId;
    }
    public void setDate(String date){
        this.date = date;
    }
    public String getDate(){
        return date;
    }
}