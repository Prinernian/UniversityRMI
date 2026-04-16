package it.workStation.model;

import java.io.Serializable;
import java.util.List;

public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    String id;
    String name;
    String teacher;
    int credits;

    public Course() {
        super();
    }
    public Course(String id) {
        super();
        this.id = id;
    }
    public Course(String id, String name, String teacher, int credits) {
        super();
        this.id = id;
        this.name = name;
        this.teacher = teacher;
        this.credits = credits;
    }

    public String getTeacher(){
        return teacher;
    }
    public int getCredits(){
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }
    public void setTeacher(String teacher){
        this.teacher = teacher;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}