package it.workStation.interfaces;

import it.workStation.model.Student;

public interface StudentService extends java.rmi.Remote{
    Student getStudent(String studentId) throws java.rmi.RemoteException;
    void registerStudent(Student std) throws java.rmi.RemoteException;
    void printStudents();
}