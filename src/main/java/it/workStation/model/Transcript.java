package it.workStation.model;

import java.io.Serializable;
import java.util.List;

public class Transcript implements Serializable {
    private static final long serialVersionUID = 1L;
    private Student student;
    private List<Course> courses;
    private List<Grade> grades;
    private String date;
    private double average;
    public Transcript(Student std, List<Course> crs, List<Grade> grd, String date, double avg){
        super();
        this.student = std;
        this.courses = crs;
        this.grades = grd;
        this.date = date;
        this.average = avg;
    }
    public Student getStudent(){
        return student;
    }
    public void setStudent(Student std){
        this.student = std;
    }
    public List<Course> getCourse(){
        return courses;
    }
    public void setCourse(List<Course> crs){
        this.courses = crs;
    }
    public List<Grade> getGrades(){
        return grades;
    }
    public void setGrades(List<Grade> grd){
        this.grades = grd;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String dt){
        this.date = dt;
    }
    public void setAverage(List<Grade> grd){
        double sum = 0;
        for(int i = 0; i < grd.size(); i++) {
            sum = sum + grd.get(i).getGrade();
        }
        this.average = sum/grd.size();
    }
    public double getAverage(){
        return average;
    }
}