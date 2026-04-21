package it.workStation.interfaces;

import it.workStation.model.Course;
import it.workStation.model.Grade;
import it.workStation.model.Student;
import java.util.List;

public interface GradeService extends java.rmi.Remote{
    void assignGrade(Student studentId, Course courseId, double grade)
            throws java.rmi.RemoteException;
    Grade getStudentGrades(Student studentId, String courseId)
            throws java.rmi.RemoteException;
    List<Grade> getStudentAllGrades(Student studentId)
            throws java.rmi.RemoteException;
}