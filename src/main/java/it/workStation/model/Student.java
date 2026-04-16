package it.workStation.model;
import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String id;
    String name;
    String email;
    int enrollmentYear;

    public Student() {
        super();
    }
    public Student(String id, String name, String email, int enrollmentYear) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.enrollmentYear = enrollmentYear;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getEnrollmentYear() {
        return enrollmentYear;
    }
}