package it.workStation.model;

import java.io.Serializable;
import java.util.List;

public class Transcript implements Serializable {
    Student student;
    List<Course> courses;
    List<Grade> grades;
    int date;
    double average;
}
