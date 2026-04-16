package it.workStation.impl;

import it.workStation.interfaces.StudentService;
import it.workStation.model.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;


public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {
    private final Map<String, Student> students = new HashMap<>();
    public StudentServiceImpl() throws RemoteException {
        super();
    }
    @Override
    public Student getStudent(String studentId) throws RemoteException{
        return students.get(studentId);
    }
    @Override
    public void registerStudent(Student std) throws RemoteException{
        students.put(std.getId(), std);
    }
    public void printStudents(){
        System.out.println(students);
    }
}