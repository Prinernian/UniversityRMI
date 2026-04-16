package it.workStation.impl;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.workStation.interfaces.GradeService;
import it.workStation.model.Course;
import it.workStation.model.Grade;
import it.workStation.model.Student;

public class GradeServiceImpl extends UnicastRemoteObject implements GradeService {
    private final Map<Student, List<Grade>> studentsGrades = new HashMap<>();
    public GradeServiceImpl() throws Exception{
        super();
    }
    @Override
    public void assignGrade(Student studentId, Course courseId, double grade) throws RemoteException{
        if(studentsGrades.containsKey(studentId)){
            List<Grade> grades = studentsGrades.get(studentId);
            grades.add(new Grade(studentId, courseId, grade, " "));
            studentsGrades.put(studentId, grades);
        }
        else {
            List<Grade> grades = new ArrayList<>();
            grades.add(new Grade(studentId, courseId, grade, " "));
            studentsGrades.put(studentId, grades);
        }
    }

    @Override
    public Grade getStudentGrades(Student studentId, String courseId) throws RemoteException{}

    @Override
    public List<Grade> getStudentAllGrades(Student studentId) throws RemoteException{}
}
